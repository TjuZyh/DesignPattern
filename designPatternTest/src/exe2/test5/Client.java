package exe2.test5;

/**
 * @Author zyh
 * @Date 2022/4/18 2:15 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Resume resume = new Resume("zyh", 22, new Photo(22));

        //clone
        Resume resume1 = resume.clone();
        resume.getPhoto().setSize(30);
        System.out.println(resume);
        System.out.println(resume1);

        System.out.println();

        //deepClone
        Resume resume2 = resume.deepClone();
        resume.getPhoto().setSize(40);
        System.out.println(resume);
        System.out.println(resume2);
    }
}
