package exe3.test4;

/**
 * @Author zyh
 * @Date 2022/4/28 10:44 下午
 * @Version 1.0
 */
//Decorator
public abstract class Decorator {
    protected Table table;

    public abstract void addHeader(Table table);

    public abstract void addTail(Table table);
}
