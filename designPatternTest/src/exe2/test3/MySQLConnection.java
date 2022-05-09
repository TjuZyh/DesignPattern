package exe2.test3;

/**
 * @Author zyh
 * @Date 2022/4/18 1:00 下午
 * @Version 1.0
 */
public class MySQLConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("MySQLConnection");
    }
}
