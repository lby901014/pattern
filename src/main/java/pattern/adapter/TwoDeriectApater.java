package pattern.adapter;

import java.util.List;

/**
 * Created by lby on 2018/9/8.
 */
public class TwoDeriectApater implements LogDbOperateApi,LogFileOperateApi {

    private LogDbOperateApi logDbOperateApi;

    private LogFileOperateApi logFileOperateApi;

    public TwoDeriectApater(LogDbOperateApi logDbOperateApi,LogFileOperateApi logFileOperateApi){
        this.logDbOperateApi = logDbOperateApi;
        this.logFileOperateApi = logFileOperateApi;
    }

    /**
     *
     * --------------以下为第二版兼容第一版部分----------
     */

    @Override
    public void createLog(List<LogModel> list) {
        logFileOperateApi.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel logModel) {
        List<LogModel> list = logFileOperateApi.readLogFile();
        list.forEach(item->{
            logModel.getLogId().equals(item.getLogId());
            list.remove(item);
        });
        logFileOperateApi.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        List<LogModel> list = logFileOperateApi.readLogFile();
        list.forEach(item->{
            logModel.getLogId().equals(item.getLogId());
            list.remove(item);
        });
        list.add(logModel);
        logFileOperateApi.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLogs() {
        return logFileOperateApi.readLogFile();
    }

    /**
     *
     * --------------以下为第一版兼容第二版部分----------
     */

    @Override
    public void writeLogFile(List<LogModel> list) {
        logDbOperateApi.createLog(list);
    }

    @Override
    public List<LogModel> readLogFile() {
        return logDbOperateApi.getAllLogs();
    }
}
