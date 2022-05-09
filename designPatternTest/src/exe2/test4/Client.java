package exe2.test4;

/**
 * @Author zyh
 * @Date 2022/4/18 1:44 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //Builder builder = new SportBuilder();
        Builder builder = new F1Builder();
        Director director = new Director(builder);
        Car car = director.construct();
        System.out.println(car.getBody());
        System.out.println(car.getEngine());
        System.out.println(car.getTire());
        System.out.println(car.getGearbox());
    }
}
