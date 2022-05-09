package exe4.test6;

/**
 * @Author zyh
 * @Date 2022/5/7 8:31 下午
 * @Version 1.0
 */
public class UnRedoOriginator {
    private String state;
    private UnRedoCaretaker unRedoCaretaker;

    public UnRedoOriginator() {
        unRedoCaretaker=new UnRedoCaretaker();
    }

    public Memento createMemento(){
        return new Memento(this);
    }

    public void restoreMemento(Memento memento){
        this.state=memento.getState();
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public void setAndStoreState(String state){
        this.setState(state);
        unRedoCaretaker.addMemento(this.createMemento());
    }
    public void undo(){
        Memento memento=unRedoCaretaker.undo();
        if (memento!=null){
            System.out.println(memento.getState());
        }
    }
    public void redo(){
        Memento memento=unRedoCaretaker.redo();
        if (memento!=null) {
            System.out.println(memento.getState());
        }
    }
}
