package pattern.facade;

/**
 * Created by lby on 9/6/2018.
 */
public class Presentation {
    public void generate(){
        ConfigModel  model = ConfigManager.getConfigManager().getConfigModel();
        if(model.isNeedPresentation()){
            System.out.println("generate presentation");
        }
    }
}
