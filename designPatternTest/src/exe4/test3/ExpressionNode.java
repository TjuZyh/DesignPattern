package exe4.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyh
 * @Date 2022/5/6 8:07 下午
 * @Version 1.0
 */
public class ExpressionNode implements AbstractDBNode {
    private List<AbstractDBNode> nodes = new ArrayList<>();

    @Override
    public void interpret(Context context) {
        while (true){
            if(context.currentToken() == null){
                break;
            }else{
                AbstractDBNode node = new OptionNode();
                node.interpret(context);
                nodes.add(node);
            }
        }
    }

    @Override
    public String execute() {
        String result = "";
        for (AbstractDBNode node : nodes) {
            result += node.execute();
        }
        return result;
    }
}
