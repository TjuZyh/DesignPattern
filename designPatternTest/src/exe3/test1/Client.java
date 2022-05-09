package exe3.test1;

/**
 * @Author zyh
 * @Date 2022/4/27 9:34 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Encode encode = new EncodePwd(new EncodeSha256());
        System.out.println(encode.encodePassword("i'm zyh"));
    }
}
