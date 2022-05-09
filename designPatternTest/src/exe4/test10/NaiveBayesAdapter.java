package exe4.test10;

/**
 * @Author zyh
 * @Date 2022/5/9 7:51 下午
 * @Version 1.0
 */
public class NaiveBayesAdapter extends Classify{
    private NBAlgorithm nbAlgorithm;

    @Override
    public void algorithm() {
        nbAlgorithm.AlgorithmImpl();
    }
}
