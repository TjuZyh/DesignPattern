package exe2.test6;

/**
 * @Author zyh
 * @Date 2022/4/18 2:35 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        UserGenerator1 instance = UserGenerator1.getInstance();
        UserGenerator1 instance1 = UserGenerator1.getInstance();

        System.out.println(instance1 == instance);

        UserGenerator2 instance2 = UserGenerator2.getInstance();
        UserGenerator2 instance3 = UserGenerator2.getInstance();

        System.out.println(instance2 == instance3);
    }
}
