package exe4.test7;

/**
 * @Author zyh
 * @Date 2022/5/8 7:16 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        EditTestSubject editTestSubject = new EditTestSubject();
        editTestSubject.add(new AppearWords());
        editTestSubject.add(new DescWordsCount());
        editTestSubject.add(new WordsOrCharsCount());
        editTestSubject.operation();
    }
}
