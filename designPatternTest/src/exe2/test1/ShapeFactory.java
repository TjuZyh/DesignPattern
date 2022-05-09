package exe2.test1;

/**
 * @Author zyh
 * @Date 2022/4/17 4:41 下午
 * @Version 1.0
 */
public class ShapeFactory {

    public static Shape createShape(String type) throws UnsupportedShapeException{
        Shape shape;
        if(type.equals("circle")){
            shape = new Circle();
        }else if(type.equals("rectangle")){
            shape = new Rectangle();
        }else if(type.equals("triangle")){
            shape = new Triangle();
        }else {
            throw new UnsupportedShapeException("shape is not support!");
        }
        return shape;
    }
}
