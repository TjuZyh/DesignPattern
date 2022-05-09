package exe3.test7;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zyh
 * @Date 2022/5/2 2:28 下午
 * @Version 1.0
 */
public class SearchProxy implements Searchable{

    private Map<Integer , String> cache = new HashMap<>();

    @Override
    public String search(Integer integer) {
        if(cache.get(integer) != null){
            return "cache: " + cache.get(integer);
        }else{
            Search search = new Search();
            String res = search.search(integer);
            cache.put(integer , res);
            return res;
        }
    }
}
