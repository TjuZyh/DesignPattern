package framework;
import java.lang.Cloneable;

public interface Product extends Cloneable {
    //具体的使用方法交给子类实现
    public abstract void use(String s);
    //用于复制实例的方法
    public abstract Product createClone();
}
