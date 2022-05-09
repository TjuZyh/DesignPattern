package exe4.test3;

/**
 * @Author zyh
 * @Date 2022/5/6 8:06 下午
 * @Version 1.0
 */
public class DbNode implements AbstractDBNode {
    private String dbName;

    @Override
    public void interpret(Context context) {
        String op = context.currentToken();
        if("FROM".equals(op) || "TO".equals(op)){
            context.skipToken(op);
        }
        dbName = context.currentToken();
        context.skipToken(dbName);
    }

    @Override
    public String execute() {
        return dbName;
    }
}
