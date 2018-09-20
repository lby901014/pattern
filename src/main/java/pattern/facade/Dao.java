package pattern.facade;

/**
 * Created by lby on 9/6/2018.
 */
public class Dao {
    public void generate(){
        ConfigModel  model = ConfigManager.getConfigManager().getConfigModel();
        if(model.isNeedDao()){
            System.out.println("generate Dao");
        }
    }
}
