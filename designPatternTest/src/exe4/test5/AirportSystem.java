package exe4.test5;

/**
 * @Author zyh
 * @Date 2022/5/7 4:19 下午
 * @Version 1.0
 */
public class AirportSystem implements Colleague{
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String returnUSerInfo() {
        return "AirportSystem userInfo";
    }
}
