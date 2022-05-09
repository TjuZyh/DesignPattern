package exe2.test4;

/**
 * @Author zyh
 * @Date 2022/4/18 1:41 下午
 * @Version 1.0
 */
public class SportBuilder extends Builder{
    @Override
    public void buildBody() {
        car.setBody("sport body");
    }

    @Override
    public void buildEngine() {
        car.setEngine("sport engine");
    }

    @Override
    public void buildTire() {
        car.setTire("sport tire");
    }

    @Override
    public void buildGearbox() {
        car.setGearbox("sport gearbox");
    }
}
