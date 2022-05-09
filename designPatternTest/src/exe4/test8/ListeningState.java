package exe4.test8;

/**
 * @Author zyh
 * @Date 2022/5/8 7:40 下午
 * @Version 1.0
 */
public class ListeningState implements State{
    private TCPConnection tcpConnection;

    public ListeningState(TCPConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void responseHandle(String request) {
        System.out.println("收到请求，ListeningState响应，监听状态");
    }
}
