package exe4.test1;

/**
 * @Author zyh
 * @Date 2022/5/6 11:57 上午
 * @Version 1.0
 */
public class NumEncodeFilter extends Filter{

    public NumEncodeFilter(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Data data) {
        char[] chars = data.getData().toCharArray();
        for(char ch : chars){
            if(ch >= 0 && ch <= 9){
                return true;
            }
        }
        return false;
    }
}
