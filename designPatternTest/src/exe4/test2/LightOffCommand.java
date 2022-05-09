package exe4.test2;

/**
 * @Author zyh
 * @Date 2022/5/6 7:43 下午
 * @Version 1.0
 */
public class LightOffCommand implements Command{
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOff();
    }
}
