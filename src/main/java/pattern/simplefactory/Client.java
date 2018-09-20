package pattern.simplefactory;

import pattern.simplefactory.Api;
import pattern.simplefactory.Factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by lby on 2018/9/5.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Api api = Factory.createApi();
        api.say();

    }
}
