package exe2.test3;

/**
 * @Author zyh
 * @Date 2022/4/18 1:01 下午
 * @Version 1.0
 */
public class OracleConnection implements Connection{

    @Override
    public void connect() {
        System.out.println("OracleConnection");
    }
}
