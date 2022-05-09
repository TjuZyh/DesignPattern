package exe4.test3;

/**
 * @Author zyh
 * @Date 2022/5/6 8:08 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        String str = "MOVE FUNCTION Student FROM srcDB TO desDB";

        Context context = new Context(str);
        AbstractDBNode  node = new ExpressionNode();
        node.interpret(context);
        System.out.println(node.execute());
    }
}
