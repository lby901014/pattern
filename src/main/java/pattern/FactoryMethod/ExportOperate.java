package pattern.FactoryMethod;

/**
 * Created by lby on 2018/9/20.
 */
public abstract class ExportOperator {
    protected abstract ExportFileApi factoryMethod();
    public void someOperation(){
        ExportFileApi exportFileApi = factoryMethod();
    }
}
