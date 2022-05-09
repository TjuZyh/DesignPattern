package exe2.test4;

/**
 * @Author zyh
 * @Date 2022/4/18 1:39 下午
 * @Version 1.0
 */
public class F1Builder extends Builder{

    @Override
    public void buildBody() {
        car.setBody("F1Body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("F1Engine");
    }

    @Override
    public void buildTire() {
        car.setTire("F1 Tire");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("F1 GearBox");
    }
}
