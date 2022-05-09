package exe4.test8;

import exe4.test3.Context;

/**
 * @Author zyh
 * @Date 2022/5/8 7:47 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        TCPConnection tcpConnection1 = new TCPConnection();
        tcpConnection1.setCurState(new ListeningState(tcpConnection1));
        tcpConnection1.responseHandle("request");

        TCPConnection tcpConnection2 = new TCPConnection();
        tcpConnection2.setCurState(new ClosedState(tcpConnection2));
        tcpConnection2.responseHandle("request");

        TCPConnection tcpConnection3 = new TCPConnection();
        tcpConnection3.setCurState(new EstablishedState(tcpConnection3));
        tcpConnection3.responseHandle("request");
    }
}
