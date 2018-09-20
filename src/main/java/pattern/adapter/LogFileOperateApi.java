package pattern.adapter;

import java.util.List;

/**
 * Created by lby on 9/7/2018.
 */
public interface LogFileOperateApi {
    void writeLogFile(List<LogModel> list);
    List<LogModel> readLogFile();
}
