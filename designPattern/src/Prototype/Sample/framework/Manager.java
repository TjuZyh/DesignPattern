package framework;
import java.util.*;

public class Manager {
    //用于保存实例的名字以及实例之间的对应关系
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoName) {
        Product p = (Product)showcase.get(protoName);
        return p.createClone();
    }
}
