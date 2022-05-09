package exe2.test2;

/**
 * @Author zyh
 * @Date 2022/4/17 10:30 下午
 * @Version 1.0
 */
public class POP3Connection implements Connection{
    @Override
    public void connect() {
        System.out.println("POP3Connection");
    }
}
