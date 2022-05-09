package exe4.test6;

/**
 * @Author zyh
 * @Date 2022/5/7 8:34 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        UnRedoOriginator originator=new UnRedoOriginator();
        System.out.println("执行的操作顺序:add sub mul div");
        originator.setAndStoreState("add");
        originator.setAndStoreState("sub");
        originator.setAndStoreState("mul");
        originator.setAndStoreState("div");

        System.out.println("第一次undo操作：");
        originator.undo();
        System.out.println("第二次undo操作：");
        originator.undo();
        System.out.println("第一次redo操作：");
        originator.redo();
        System.out.println("第三次undo操作：");
        originator.undo();
        System.out.println("第四次undo操作：");
        originator.undo();
        System.out.println("第二次redo操作：");
        originator.redo();
    }
}
