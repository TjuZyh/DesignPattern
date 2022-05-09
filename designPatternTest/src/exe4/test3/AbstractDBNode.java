package exe4.test3;

/**
 * @Author zyh
 * @Date 2022/5/6 8:02 下午
 * @Version 1.0
 */
public interface AbstractDBNode {
    void interpret(Context context);
    String execute();
}
