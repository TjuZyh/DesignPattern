package exe2.test3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Author zyh
 * @Date 2022/4/18 1:07 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Properties properties = new Properties();
        InputStream resourceAsStream = Client.class.getResourceAsStream("applications.properties");
        try {
            //加载配置文件，获取对应字段数据信息
            properties.load(resourceAsStream);
            String type = properties.getProperty("type");
            String className = "exe2.test3." + type;
            //反射机制
            AbstractFactory factory = (AbstractFactory) Class.forName(className).newInstance();
            Connection connection = factory.createConnection();
            Statement statement = factory.createStatement();

            connection.connect();
            statement.state();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
