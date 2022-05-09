package exe2.test1;

/**
 * @Author zyh
 * @Date 2022/4/17 4:37 下午
 * @Version 1.0
 */
public class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("draw circle");
    }

    @Override
    public void erase() {
        System.out.println("erase circle");
    }
}
