package exe3.test2;

/**
 * @Author zyh
 * @Date 2022/4/27 9:53 下午
 * @Version 1.0
 */
public class JPGImage extends Image {
    public JPGImage(Filter filter) {
        super(filter);
    }

    @Override
    public void operation() {
        filter.addFilter();
    }
}
