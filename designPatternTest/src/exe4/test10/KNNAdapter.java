package exe4.test10;

/**
 * @Author zyh
 * @Date 2022/5/9 7:52 下午
 * @Version 1.0
 */
public class KNNAdapter extends Classify{
    private KNNAlgorithm knnAlgorithm;

    @Override
    public void algorithm() {
        knnAlgorithm.AlgorithmImpl();
    }
}
