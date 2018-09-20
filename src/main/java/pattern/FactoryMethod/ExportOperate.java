package pattern.FactoryMethod;

/**
 * Created by lby on 2018/9/20.
 */
public abstract class ExportOperate {
    protected abstract ExportFileApi factoryMethod();
    public boolean export(){
        ExportFileApi exportFileApi = factoryMethod();
        return exportFileApi.export("gaga");
    }
}
