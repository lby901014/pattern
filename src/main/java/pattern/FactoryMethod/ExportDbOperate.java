package pattern.FactoryMethod;

/**
 * Created by lby on 2018/9/20.
 */
public class ExportDbOperate extends ExportOperate {

    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDb();
    }
}
