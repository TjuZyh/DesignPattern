package exe4.test6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author zyh
 * @Date 2022/5/7 8:27 下午
 * @Version 1.0
 */
public class UnRedoCaretaker {
    private List<Memento> undoList;
    private List<Memento> redoList;

    public UnRedoCaretaker() {
        undoList = new ArrayList<>();
        redoList = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        for (int i=redoList.size()-1;i>=0;i--){
            redoList.remove(i);
        }
        undoList.add(memento);
    }

    public Memento undo(){
        Memento result = null;
        if (undoList.size() > 1){
            result = undoList.get(undoList.size() - 2);
            redoList.add(undoList.get(undoList.size() - 1));
            undoList.remove(undoList.size() - 1);
        }else {
            System.out.println("fail to undo operation!");
        }
        return result;
    }

    public Memento redo(){
        Memento result = null;
        if(redoList.size() > 0){
            result=redoList.get(redoList.size() - 1);
            undoList.add(result);
            redoList.remove(redoList.size() - 1);
        }else {
            System.out.println("fail to redo operation!");
        }
        return result;
    }
}
