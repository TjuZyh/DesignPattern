package exe3.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyh
 * @Date 2022/4/27 10:21 下午
 * @Version 1.0
 */
public class Member extends Component{

    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void onMessage(){
        System.out.println(this.getName() + "收到！");
    }

    @Override
    public void add(Component component) {
        try {
            throw new CallException("不可调用！");
        } catch (CallException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(Component component) {
        try {
            throw new CallException("不可调用！");
        } catch (CallException e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    @Override
    public void share(Component component) {
        if(component instanceof Group){
            List<Component> componentList = ((Group) component).getComponentList();

            if(componentList.contains(this)){
                componentList.remove(this);
            }

            for(Component com : componentList){
                com.share(com);
            }

            componentList.add(this);
        }else if(component instanceof Member){
            ((Member) component).onMessage();
        }

    }
}
