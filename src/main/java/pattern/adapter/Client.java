package pattern.adapter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lby on 9/7/2018.
 */
public class Client {
    public static void main(String[] args) {

    }

    public static void testTwoDeriectAdapter(){
        LogFileOperateApi logFileOperateImpl = new LogFileOperateImpl("d:/1.log");
        LogDbOperateApi logDbOperateImpl = new LogDbOperateImpl();
        LogFileOperateApi fileApi = new TwoDeriectApater(logDbOperateImpl,logFileOperateImpl);
        LogDbOperateApi dbApi = new TwoDeriectApater(logDbOperateImpl,logFileOperateImpl);

        List<LogModel> list = new LinkedList<>();
        list.add(LogModel.builder().logId("1").operTime("8888-10-14").operUser("lby").content("hallo").build());
        list.add(LogModel.builder().logId("2").operTime("2222-10-15").operUser("lby").content("hello").build());
        dbApi.createLog(list);
        System.out.println(dbApi.getAllLogs());

        System.out.println(fileApi.readLogFile());

    }
    public static void testAdapter(){
        LogFileOperateApi logFileOperateImpl = new LogFileOperateImpl("d:/1.log");
        LogDbOperateApi logDbOperateApi = new Adapter(logFileOperateImpl);
        System.out.println(logDbOperateApi.getAllLogs());
        logDbOperateApi.updateLog(LogModel.builder().logId("1").operTime("6666-10-14").operUser("lby").content("hallo").build());
        System.out.println(logDbOperateApi.getAllLogs());

    }

    public static void testFile(){
        LogFileOperateApi logFileOperateImpl = new LogFileOperateImpl("d:/1.log");
        List<LogModel> list = new LinkedList<>();
        list.add(LogModel.builder().logId("1").operTime("2900-10-14").operUser("lby").content("hallo").build());
        list.add(LogModel.builder().logId("2").operTime("2900-10-15").operUser("lby").content("hello").build());
        logFileOperateImpl.writeLogFile(list);
        List<LogModel> logModels = logFileOperateImpl.readLogFile();
        System.out.println(logModels);
    }

    public static void testDb(){
        LogDbOperateApi logDbOperateApi = new LogDbOperateImpl();
        List <LogModel> list = new ArrayList<>();
        list.add(LogModel.builder().content("test").build());
        logDbOperateApi.createLog(list);
        logDbOperateApi.removeLog(LogModel.builder().content("test").build());
        logDbOperateApi.updateLog(LogModel.builder().content("test").build());
        logDbOperateApi.getAllLogs();

    }

}
