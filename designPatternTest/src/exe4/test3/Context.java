package exe4.test3;

import java.util.StringTokenizer;

/**
 * @Author zyh
 * @Date 2022/5/6 8:03 下午
 * @Version 1.0
 */
public class Context {
    public StringTokenizer tokenizer;
    public String currentToken;

    public Context(String test) {
        tokenizer = new StringTokenizer(test);
        nextToken();
    }

    public String nextToken() {
        if(tokenizer.hasMoreTokens()){
            currentToken = tokenizer.nextToken();
        }else{
            currentToken = null;
        }
        return currentToken;
    }

    public String currentToken() {
        return currentToken;
    }

    public void skipToken(String token){
        if(!token.equals(currentToken)){
            System.out.println("错误：" + currentToken + "解释错误！");
        }
        nextToken();
    }
}
