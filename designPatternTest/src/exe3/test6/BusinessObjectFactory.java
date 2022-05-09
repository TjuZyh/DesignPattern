package exe3.test6;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zyh
 * @Date 2022/5/1 3:34 下午
 * @Version 1.0
 */
public class BusinessObjectFactory {
    private static BusinessObjectFactory singleton = new BusinessObjectFactory();
    private Map<Integer , BusinessObject> pool;

    private BusinessObjectFactory() {
        this.pool = new HashMap<>();
    }

    public static BusinessObjectFactory getInstance(){
        return singleton;
    }

    public BusinessObject getBusinessObject(Integer integer){
        return pool.get(integer);
    }

    public void createBusinessObject(Integer integer , BusinessObject businessObject){
        this.pool.put(integer , businessObject);
    }
}
