package exe4.test2;

/**
 * @Author zyh
 * @Date 2022/5/6 7:43 下午
 * @Version 1.0
 */
public class RemoteController {
    private Command[] onCommands = new Command[5];
    private Command[] offCommands = new Command[5];

    public RemoteController() {
    }

    public void setCommand(int slot , Command oncommand , Command offCommand){
        onCommands[slot] = oncommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }
}
