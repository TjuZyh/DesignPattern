package exe4.test3;

/**
 * @Author zyh
 * @Date 2022/5/6 8:04 下午
 * @Version 1.0
 */
public class OperateNode implements AbstractDBNode {
    private String operate; //动作
    private String opname;  //动作名称

    @Override
    public void interpret(Context context) {
        operate = context.currentToken();
        context.skipToken(operate);
        if("COPY".equals(operate)){
            opname = "复制";
        }else if("MOVE".equals(operate)){
            opname = "移动";
        }else{
            opname = "无法识别命令";
        }
    }

    @Override
    public String execute() {
        return opname;
    }
}
