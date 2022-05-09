package exe2.test1;

/**
 * @Author zyh
 * @Date 2022/4/17 4:47 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws UnsupportedShapeException {
        Shape shape1 = ShapeFactory.createShape("circle");
        Shape shape2 = ShapeFactory.createShape("rectangle");
        Shape shape3 = ShapeFactory.createShape("triangle");
        shape1.draw();
        shape2.draw();
        shape3.draw();

        shape1.erase();
        shape2.erase();
        shape3.erase();

    }
}
