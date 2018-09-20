package pattern.FactoryMethod;

/**
 * Created by lby on 2018/9/20.
 */
public class Client {
    public static void main(String[] args) {
        ExportOperate exportOperate = new ExportDbOperate();
        ExportOperate exportOperate1 = new ExportTxtOperate();
        exportOperate.export();
        exportOperate1.export();
    }
}
