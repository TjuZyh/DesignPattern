package exe3.test3;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyh
 * @Date 2022/4/27 10:25 下午
 * @Version 1.0
 */
public class Group extends Component{

    private String name;

    private List<Component> componentList = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    //只暴露name的setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void share(Component component) {
        if(component instanceof Group){
            List<Component> componentList = ((Group) component).getComponentList();
            for(Component com : componentList){
                com.share(com);
            }
        }else if(component instanceof Member){
            ((Member) component).onMessage();
        }
    }
}
