package pattern.adapter;

import java.util.List;

/**
 * Created by lby on 2018/9/8.
 */
public interface LogDbOperateApi {
    void createLog(List<LogModel> list);
    void removeLog(LogModel logModel);
    void updateLog(LogModel logModel);
    List<LogModel> getAllLogs();
}
