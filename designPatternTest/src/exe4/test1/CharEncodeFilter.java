package exe4.test1;

/**
 * @Author zyh
 * @Date 2022/5/6 11:51 上午
 * @Version 1.0
 */
public class CharEncodeFilter extends Filter{

    public CharEncodeFilter(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Data data) {
        char[] chars = data.getData().toCharArray();
        for(char ch : chars){
            if((ch - 'a') >= 0 && (ch - 'z') <= 0){
                return true;
            }
        }
        return false;
    }
}
