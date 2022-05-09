package exe4.test6;

/**
 * @Author zyh
 * @Date 2022/5/7 8:24 下午
 * @Version 1.0
 */
public class Memento {
    private String state;

    public Memento(UnRedoOriginator unRedoOriginator){
        this.state = unRedoOriginator.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
