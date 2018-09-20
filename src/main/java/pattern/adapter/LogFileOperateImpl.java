package pattern.adapter;

import java.io.*;
import java.util.List;

/**
 * Created by lby on 9/7/2018.
 */
public class LogFileOperateImpl implements LogFileOperateApi {

    private String logFilePathName = "";

    LogFileOperateImpl(String logFilePathName){
        File file = new File(logFilePathName);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.logFilePathName = logFilePathName;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(logFilePathName)));
            objectOutputStream.writeObject(list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream  objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(new File(logFilePathName)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            list = (List<LogModel>) objectInputStream.readObject()  ;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
