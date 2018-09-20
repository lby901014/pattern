package pattern.facade;

/**
 * Created by lby on 9/7/2018.
 */
public class Facade {
    public static void generate(){
        new Dao().generate();
        new Presentation().generate();
        new Bussiness().generate();
    }
}
