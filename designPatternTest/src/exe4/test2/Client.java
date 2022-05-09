package exe4.test2;

/**
 * @Author zyh
 * @Date 2022/5/6 7:49 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        Light livingRoomLight=new Light("Living Room");
        Light kitchenLight=new Light("kitchen");

        LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn=new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff=new LightOffCommand(kitchenLight);

        remoteController.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteController.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteController.onButtonWasPushed(0);
        remoteController.offButtonWasPushed(0);
        remoteController.onButtonWasPushed(1);
        remoteController.offButtonWasPushed(1);
    }
}
