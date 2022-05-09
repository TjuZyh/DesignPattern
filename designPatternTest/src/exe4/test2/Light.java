package exe4.test2;

/**
 * @Author zyh
 * @Date 2022/5/6 7:39 下午
 * @Version 1.0
 */
public class Light {
    private String name;

    public Light() {
    }

    public Light(String name) {
        this.name = name;
    }

    public void lightOn(){
        System.out.println("开灯");
    }

    public void lightOff(){
        System.out.println("关灯");
    }

}
