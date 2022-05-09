package exe3.test4;

/**
 * @Author zyh
 * @Date 2022/4/28 10:46 下午
 * @Version 1.0
 */
//concreteDecorator
public class ConcreteDecoratorByStar extends Decorator {

    @Override
    public void addHeader(Table table) {
        System.out.println("********************");
    }

    @Override
    public void addTail(Table table) {
        System.out.println("********************");
    }
}
