package exe3.test5;

/**
 * @Author zyh
 * @Date 2022/4/30 2:37 下午
 * @Version 1.0
 */
public class Facade {
    private ContractManager contractManager;
    private PhotoManager photoManager;
    private SmsManager smsManager;
    private SongManager songManager;

    public Facade() {
        contractManager = new ContractManager();
        photoManager = new PhotoManager();
        smsManager = new SmsManager();
        songManager = new SongManager();
    }

    public void oneKeyBackup(){
        contractManager.oneKeyBackup();
        photoManager.oneKeyBackup();
        smsManager.oneKeyBackup();
        songManager.oneKeyBackup();
    }
}
