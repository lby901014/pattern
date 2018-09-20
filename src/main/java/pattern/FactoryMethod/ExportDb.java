package pattern.FactoryMethod;

/**
 * Created by lby on 2018/9/20.
 */
public class ExportDb implements ExportFileApi {

    @Override
    public boolean export(String data) {
        System.out.println("ExportDb"+data);
        return true;
    }
}
