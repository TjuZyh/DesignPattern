package exe4.test1;

import java.util.ArrayList;

/**
 * @Author zyh
 * @Date 2022/5/6 12:00 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Filter filter1 = new CharEncodeFilter("filter1");
        Filter filter2 = new NumEncodeFilter("filter2");
        Filter filter3 = new DataCheckFilter("filter3");

        filter1.setNext(filter2).setNext(filter3);

        ArrayList<String> list = new ArrayList<>();
        list.add("abcabc");
        list.add("1231231");
        list.add("abcabc23232");
        list.add("sd798sd89");

        for(String str : list){
            filter1.filter(new Data(str));
        }
    }
}
