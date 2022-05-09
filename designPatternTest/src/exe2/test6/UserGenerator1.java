package exe2.test6;

/**
 * @Author zyh
 * @Date 2022/4/18 2:29 下午
 * @Version 1.0
 */
//饿汉式
public class UserGenerator1 {
    private UserGenerator1(){

    }

    private static UserGenerator1 instance = new UserGenerator1();

    public static UserGenerator1 getInstance(){
        return instance;
    }
}
