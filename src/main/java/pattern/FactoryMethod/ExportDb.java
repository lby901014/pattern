package pattern.FactoryMethod;

/**
 * Created by lby on 2018/9/20.
 */
public class ExportTxt implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("ExportTxt");
        return true;
    }
}
