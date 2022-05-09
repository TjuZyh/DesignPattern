package exe2.test1;

/**
 * @Author zyh
 * @Date 2022/4/17 4:38 下午
 * @Version 1.0
 */
public class Rectangle extends Shape{

    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }

    @Override
    public void erase() {
        System.out.println("erase rectangle");
    }
}
