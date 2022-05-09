package exe4.test10;

/**
 * @Author zyh
 * @Date 2022/5/9 7:52 下午
 * @Version 1.0
 */
public class DecisionTreeAdapter extends Classify{
    private DTAlgorithm dtAlgorithm;

    @Override
    public void algorithm() {
        dtAlgorithm.AlgorithmImpl();
    }
}
