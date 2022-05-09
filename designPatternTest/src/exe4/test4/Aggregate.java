package exe4.test4;

import java.util.ArrayList;

/**
 * @Author zyh
 * @Date 2022/5/7 3:34 下午
 * @Version 1.0
 */
public class Aggregate implements AbstractAggregate{

    private ArrayList<String> names;

    public Aggregate() {
        names = new ArrayList<>();
        for(int i = 0 ; i < 100 ;i++){
            names.add(i , "用户" + (i + 1));
        }
    }

    @Override
    public AbstractIterator createIterator() {
        return new MyIterator();
    }

    public class MyIterator implements AbstractIterator{
        private Aggregate aggregate;
        private int currentPage;
        private int num;

        //页面输出方法，a-每页的数量 ， b-页号
        @Override
        public void paging(int a, int b) {
            num = a;
            currentPage = b;
            if (names.size() % a == 0 && b >= (names.size() / a + 1)) {
                System.out.println("您查看的页内容为空!");
            } else if (names.size() % a != 0 && b >= (names.size() / a + 2)) {
                System.out.println("您查看的页内容为空!");
            } else {
                try {
                    for (int i = ((b - 1) * a); i < (((b - 1) * a) + a); i++) {
                        System.out.println(names.get(i));
                    }
                } catch (Exception e) {
                    System.out.println("已经到底了");
                }
            }
        }

        @Override
        public void nextPage() {
            try {
                for (int i = num * currentPage; i < num * currentPage + num; i++) {
                    System.out.println(names.get(i));
                }
                currentPage += 1;
            } catch (Exception e) {
                System.out.println("当以已是最后一页！");
            }
        }

        @Override
        public void previousPage() {
            if (currentPage == 1) {
                System.out.println("当前已是第一页！");
            } else {
                for (int i = num * currentPage - (2 * num); i < num * currentPage - num; i++) {
                    System.out.println(names.get(i));
                }
                currentPage -= 1;
            }
        }

    }
}


