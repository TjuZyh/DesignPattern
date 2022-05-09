package exe4.test8;

/**
 * @Author zyh
 * @Date 2022/5/8 7:39 下午
 * @Version 1.0
 */
public class EstablishedState implements State{
    private TCPConnection tcpConnection;

    public EstablishedState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void responseHandle(String request) {
        System.out.println("收到请求，EstablishedState响应，建立状态");
    }
}
