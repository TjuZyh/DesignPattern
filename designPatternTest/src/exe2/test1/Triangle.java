package exe2.test1;

/**
 * @Author zyh
 * @Date 2022/4/17 4:39 下午
 * @Version 1.0
 */
public class Triangle extends Shape{

    @Override
    public void draw() {
        System.out.println("draw Triangle");
    }

    @Override
    public void erase() {
        System.out.println("erase Triangle");
    }
}
