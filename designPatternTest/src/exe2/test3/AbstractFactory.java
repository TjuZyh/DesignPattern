package exe2.test3;

/**
 * @Author zyh
 * @Date 2022/4/18 1:04 下午
 * @Version 1.0
 */
public interface AbstractFactory {
    Connection createConnection();
    Statement createStatement();
}
