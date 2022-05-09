package exe4.test3;

/**
 * @Author zyh
 * @Date 2022/5/6 8:07 下午
 * @Version 1.0
 */
public class OptionNode implements AbstractDBNode {
    private AbstractDBNode operate, optional, fromDb,targetDb; //动作，操作对象，原始库，目标库

    @Override
    public void interpret(Context context) {
        operate = new OperateNode();
        operate.interpret(context);
        optional = new OptionalNode();
        optional.interpret(context);
        fromDb = new DbNode();
        fromDb.interpret(context);
        targetDb = new DbNode();
        targetDb.interpret(context);
    }

    @Override
    public String execute() {
        return "将数据库" + fromDb.execute() + "中的" + optional.execute() + operate.execute() + "至数据库" + targetDb.execute();
    }
}
