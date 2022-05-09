package exe4.test7;

/**
 * @Author zyh
 * @Date 2022/5/8 7:15 下午
 * @Version 1.0
 */
public class EditTestSubject extends AbstractSubject{
    @Override
    public void operation() {
        System.out.println("user在文本编辑区编辑了文本");
        notifyObservers();
    }
}
