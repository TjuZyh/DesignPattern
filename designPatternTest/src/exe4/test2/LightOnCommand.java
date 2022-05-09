package exe4.test2;

/**
 * @Author zyh
 * @Date 2022/5/6 7:41 下午
 * @Version 1.0
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }
}
