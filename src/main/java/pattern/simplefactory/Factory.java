package pattern.simplefactory;

import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lby on 2018/9/5.
 */
public class Factory {
    public static Api createApi() throws Exception{
//        InputStream is = Client.class.getClassLoader().getResourceAsStream("pattern/simplefactory/peizhi.properties");
        InputStream is = Client.class.getResourceAsStream("peizhi.properties");
        Properties properties = new Properties();
        properties.load(is);
        String className = (String) properties.get("impl");
        System.out.println(className);
        return (Api) Class.forName(className).newInstance();

    }
}
