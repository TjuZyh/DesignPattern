package exe2.test3;

/**
 * @Author zyh
 * @Date 2022/4/18 1:06 下午
 * @Version 1.0
 */
public class OracleFactory implements AbstractFactory{
    @Override
    public Connection createConnection() {
        return new OracleConnection();
    }

    @Override
    public Statement createStatement() {
        return new OracleStatement();
    }
}
