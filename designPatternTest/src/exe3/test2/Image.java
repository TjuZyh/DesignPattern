package exe3.test2;

import java.lang.reflect.Field;

/**
 * @Author zyh
 * @Date 2022/4/27 9:50 下午
 * @Version 1.0
 */
public abstract class Image {
    protected Filter filter;

    public Image(Filter filter) {
        super();
        this.filter = filter;
    }

    public abstract void operation();
}
