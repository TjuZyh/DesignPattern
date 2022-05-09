package exe3.test6;

import java.util.ArrayList;

/**
 * @Author zyh
 * @Date 2022/5/1 3:39 下午
 * @Version 1.0
 */
public class Client {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public Client(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void login(){
        BusinessObjectFactory businessObjectFactory = BusinessObjectFactory.getInstance();
        for(Integer i : arrayList){
            System.out.println(businessObjectFactory.getBusinessObject(i));
        }
    }
}
