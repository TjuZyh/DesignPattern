package exe3.test1;

/**
 * @Author zyh
 * @Date 2022/4/27 9:32 下午
 * @Version 1.0
 */
//adapter
public class EncodePwd implements Encode{
    private EncodeSha256 encodeSha256;

    public EncodePwd(EncodeSha256 encodeSha256) {
        this.encodeSha256 = encodeSha256;
    }

    @Override
    public String encodePassword(String password) {
        return encodeSha256.encodeAPI(password);
    }
}
