package exe2.test2;

/**
 * @Author zyh
 * @Date 2022/4/17 10:36 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory1 = new HTTPConnectionFactory();
        ConnectionFactory connectionFactory2 = new IMAPConnectionFactory();
        ConnectionFactory connectionFactory3 = new POP3ConnectionFactory();
        Connection connection = connectionFactory1.buildConnection();
        Connection connection1 = connectionFactory2.buildConnection();
        Connection connection2 = connectionFactory3.buildConnection();

        connection.connect();
        connection1.connect();
        connection2.connect();

    }
}
