package exe3.test2;

/**
 * @Author zyh
 * @Date 2022/4/27 10:00 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Filter filter1 = new Blur();
        Image image1 = new BMPImage(filter1);
        image1.operation();

        Filter filter2 = new Sharpen();
        Image image2 = new GIFImage(filter2);
        image2.operation();

        Filter filter3 = new Cutout();
        Image image3 = new JPGImage(filter3);
        image3.operation();
    }
}
