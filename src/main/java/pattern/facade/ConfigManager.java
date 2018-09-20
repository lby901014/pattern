package pattern.facade;

/**
 * Created by lby on 9/6/2018.
 */
public class ConfigManager {
    private static ConfigManager configManager = null;
    private static ConfigModel configModel = null;
    public static ConfigManager getConfigManager(){
        if(configManager==null){
            configManager = new ConfigManager();
            configModel = new ConfigModel();

            //这里可以根据客户端提供的配置文件进行控制
            configModel.setNeedBuss(true);
            configModel.setNeedDao(true);
            configModel.setNeedPresentation(true);
        }
        return configManager;
    }
    public static ConfigModel getConfigModel(){
        return configModel;
    }
}
