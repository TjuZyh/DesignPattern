package exe2.test3;

/**
 * @Author zyh
 * @Date 2022/4/18 1:05 下午
 * @Version 1.0
 */
public class MySQLFactory implements AbstractFactory{
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Statement createStatement() {
        return new MySQLStatement();
    }
}
