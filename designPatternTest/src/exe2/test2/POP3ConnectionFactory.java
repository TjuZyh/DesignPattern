package exe2.test2;

/**
 * @Author zyh
 * @Date 2022/4/17 10:34 下午
 * @Version 1.0
 */
public class POP3ConnectionFactory implements ConnectionFactory{
    @Override
    public Connection buildConnection() {
        return new POP3Connection();
    }
}
