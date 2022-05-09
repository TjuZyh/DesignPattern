package exe3.test4;

/**
 * @Author zyh
 * @Date 2022/4/28 10:50 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Decorator decorator1 = new ConcreteDecoratorByLine();
        Decorator decorator2 = new ConcreteDecoratorByStar();

        Table table = new Table(5 ,5);
        decorator1.addHeader(table);
        decorator2.addHeader(table);
        System.out.println(table);
        decorator1.addTail(table);
        decorator2.addTail(table);
    }
}
