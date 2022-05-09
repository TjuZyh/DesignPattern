package exe2.test4;

/**
 * @Author zyh
 * @Date 2022/4/18 1:36 下午
 * @Version 1.0
 */
public abstract class Builder {
    Car car = new Car();

    public abstract void buildBody();

    public abstract void buildEngine();

    public abstract void buildTire();

    public abstract void buildGearbox();

    public Car getResult(){
        return car;
    }

}
