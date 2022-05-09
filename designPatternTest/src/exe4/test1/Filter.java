package exe4.test1;

import java.util.Date;

/**
 * @Author zyh
 * @Date 2022/5/6 11:45 上午
 * @Version 1.0
 */
public abstract class Filter {
    private String name;
    private Filter next;

    public Filter(String name) {
        this.name = name;
    }

    public Filter setNext(Filter next) {
        this.next = next;
        return next;
    }

    public void filter(Data data){
        if(resolve(data)){
            done(data);
        }else if(next != null){
            next.filter(data);
        }else{
            fail(data);
        }
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    protected abstract boolean resolve(Data data); // 解决问题的方法
    protected void done(Data data) {  // 解决
        System.out.println(data + " is resolved by " + this + ".");
    }
    protected void fail(Data data) {  // 未解决
        System.out.println(data + " cannot be resolved.");
    }
}
