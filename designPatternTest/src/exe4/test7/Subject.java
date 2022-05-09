package exe4.test7;

import java.io.ObjectStreamException;

/**
 * @Author zyh
 * @Date 2022/5/8 11:18 上午
 * @Version 1.0
 */
public interface Subject {
    void add(Observe observe);

    void del(Observe observe);

    void notifyObservers();

    void operation();
}
