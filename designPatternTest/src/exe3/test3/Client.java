package exe3.test3;

/**
 * @Author zyh
 * @Date 2022/4/27 10:36 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Component group1 = new Group("TJULab");
        Component member1 = new Member("zyh");
        Component member2 = new Member("sy");
        Component member3 = new Member("tyw");
        Component member4 = new Member("zzl");

        group1.add(member1);
        group1.add(member2);
        group1.add(member3);
        group1.add(member4);

        member1.share(group1);
        System.out.println();
        Component group2 = new Group("Tank");
        group2.add(group1);

        Component member5 = new Member("ldy");
        group2.add(member5);
        member5.share(group2);

    }
}
