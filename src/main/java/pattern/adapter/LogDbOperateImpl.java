package pattern.adapter;

import java.util.List;

/**
 * Created by lby on 2018/9/8.
 */
public class LogDbOperateImpl implements  LogDbOperateApi{
    @Override
    public void createLog(List<LogModel> list) {
        System.out.println("DB createLog"+list);
    }

    @Override
    public void removeLog(LogModel logModel) {
        System.out.println("DB removeLog"+logModel);
    }

    @Override
    public void updateLog(LogModel logModel) {
        System.out.println("DB updateLog"+logModel);
    }

    @Override
    public List<LogModel> getAllLogs() {
        System.out.println("DB getAllLogs");
        return null;
    }
}
