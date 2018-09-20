package pattern.facade;

/**
 * Created by lby on 9/6/2018.
 */
public class Bussiness {
    public void generate(){
        ConfigModel  model = ConfigManager.getConfigManager().getConfigModel();
        if(model.isNeedBuss()){
            System.out.println("generate Bussiness");
        }
    }
}
