package exe4.test9;

/**
 * @Author zyh
 * @Date 2022/5/8 8:27 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Strategy strategy1 = new PreCopyAlgorithm();
        Strategy strategy2 = new CRRTMotionAlgorithm();
        Strategy strategy3 = new PostCopyAlgorithm();

        Context context = new Context(strategy1);
        context.contextInterface();

        context = new Context(strategy2);
        context.contextInterface();

        context = new Context(strategy3);
        context.contextInterface();
    }
}
