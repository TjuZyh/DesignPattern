package exe4.test9;

/**
 * @Author zyh
 * @Date 2022/5/8 8:26 下午
 * @Version 1.0
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.strategyInterface();
    }
}
