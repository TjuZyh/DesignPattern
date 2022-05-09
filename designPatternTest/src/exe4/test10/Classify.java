package exe4.test10;

/**
 * @Author zyh
 * @Date 2022/5/9 12:44 下午
 * @Version 1.0
 */
public abstract class Classify {
    public void readData(){
        System.out.println("读取数据");
    }

    public void convertDataFormat(){
        System.out.println("转换数据格式");
    }

    public abstract void algorithm();

    public void display(){
        System.out.println("显示分类结果");
    }
}
