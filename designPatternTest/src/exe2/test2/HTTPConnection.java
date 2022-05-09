package exe2.test2;

/**
 * @Author zyh
 * @Date 2022/4/17 10:31 下午
 * @Version 1.0
 */
public class HTTPConnection implements Connection {

    @Override
    public void connect() {
        System.out.println("HTTPConnection");
    }
}
