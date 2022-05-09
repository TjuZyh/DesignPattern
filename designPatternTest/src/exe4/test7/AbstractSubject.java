package exe4.test7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyh
 * @Date 2022/5/8 7:13 下午
 * @Version 1.0
 */
public class AbstractSubject implements Subject{
    public List<Observe> observeList = new ArrayList<>();

    @Override
    public void add(Observe observe) {
        observeList.add(observe);
    }

    @Override
    public void del(Observe observe) {
        observeList.remove(observe);
    }

    @Override
    public void notifyObservers() {
        for(Observe observe : observeList){
            observe.update();
        }
    }

    @Override
    public void operation() {

    }
}
