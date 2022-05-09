package exe2.test6;

/**
 * @Author zyh
 * @Date 2022/4/18 2:31 下午
 * @Version 1.0
 */
public class UserGenerator2 {
    private UserGenerator2(){

    }

    private static UserGenerator2 instance = null;

    public static UserGenerator2 getInstance(){
        if(instance == null){
            //保证线程安全
            synchronized(UserGenerator2.class){
                if(instance == null){
                    instance = new UserGenerator2();
                }
            }
        }
        return instance;
    }
}
