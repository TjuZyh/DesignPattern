package exe4.test3;

/**
 * @Author zyh
 * @Date 2022/5/6 8:05 下午
 * @Version 1.0
 */
public class OptionalNode implements AbstractDBNode {
    private String option;  //操作对象
    private String optionname;  //操作对象名称
    private String target;
    @Override
    public void interpret(Context context) {
        option = context.currentToken();
        context.skipToken(option);
        //option的类型可以有各种，表，视图，函数，序列，触发器等等。
        if("VIEW".equals(option)){
            optionname = "视图";
        }else if("TABLE".equals(option)){
            optionname = "表";
        }else if("FUNCTION".equals(option)){
            optionname = "函数";
        }else{
            optionname = "无法识别命令";
        }
        target = context.currentToken();
        if("FROM".equals(target)){
            target = "";
        }else{
            context.skipToken(target);
        }
    }

    @Override
    public String execute() {
        return optionname + target;
    }
}
