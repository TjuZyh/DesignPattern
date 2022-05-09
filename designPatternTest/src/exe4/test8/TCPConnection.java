package exe4.test8;

/**
 * @Author zyh
 * @Date 2022/5/8 7:41 下午
 * @Version 1.0
 */
public class TCPConnection {
    public static State ClosedState;
    public static State EstablishedState;
    public static State ListeningState;
    private State currentState;

    public TCPConnection() {
        ClosedState = new ClosedState(this);
        EstablishedState = new EstablishedState(this);
        ListeningState = new ListeningState(this);
    }

    public void setCurState(State currentState){
        this.currentState = currentState;
    }

    public void responseHandle(String request){
        currentState.responseHandle(request);
    }
}
