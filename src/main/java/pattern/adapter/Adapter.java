package pattern.adapter;

import java.util.List;

/**
 * Created by lby on 2018/9/8.
 */
public class Adapter implements LogDbOperateApi {

    LogFileOperateApi logFileOperateApi;

    Adapter(LogFileOperateApi logFileOperateApi){
        this.logFileOperateApi = logFileOperateApi;
    }

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
}
