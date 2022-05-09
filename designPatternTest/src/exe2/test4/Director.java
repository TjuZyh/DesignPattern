package exe2.test4;

/**
 * @Author zyh
 * @Date 2022/4/18 1:42 下午
 * @Version 1.0
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car construct(){
        builder.buildBody();
        builder.buildEngine();
        builder.buildTire();
        builder.buildGearbox();
        return builder.getResult();
    }
}
