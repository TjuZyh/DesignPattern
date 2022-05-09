package exe4.test8;

/**
 * @Author zyh
 * @Date 2022/5/8 7:40 下午
 * @Version 1.0
 */
public class ClosedState implements State{
    private TCPConnection tcpConnection;

    public ClosedState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void responseHandle(String request) {
        System.out.println("收到请求，ClosedState响应，关闭状态");
    }
}
