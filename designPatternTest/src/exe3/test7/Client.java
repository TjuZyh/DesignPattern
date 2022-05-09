package exe3.test7;

/**
 * @Author zyh
 * @Date 2022/5/2 2:31 下午
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Searchable search = new SearchProxy();
        System.out.println(search.search(1));
        System.out.println(search.search(1));
    }
}
