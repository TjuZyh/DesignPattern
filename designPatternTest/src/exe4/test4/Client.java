package exe4.test4;

/**
 * @Author zyh
 * @Date 2022/5/7 3:47 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractAggregate aggregate = new Aggregate();
        AbstractIterator iterator = aggregate.createIterator();
        System.out.println("分页:");
        iterator.paging(3,27);
        System.out.println("当前页的上一页:");
        iterator.previousPage();
        System.out.println("当前页的下一页:");
        iterator.nextPage();
    }
}
