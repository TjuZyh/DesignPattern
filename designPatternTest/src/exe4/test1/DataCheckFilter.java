package exe4.test1;

/**
 * @Author zyh
 * @Date 2022/5/6 12:00 下午
 * @Version 1.0
 */
public class DataCheckFilter extends Filter{

    public DataCheckFilter(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Data data) {
        return true;
    }
}
