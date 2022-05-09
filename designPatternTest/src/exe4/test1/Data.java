package exe4.test1;

/**
 * @Author zyh
 * @Date 2022/5/6 11:47 上午
 * @Version 1.0
 */
public class Data {
    private String data;

    public Data(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "[Data " + data + "]";
    }
}
