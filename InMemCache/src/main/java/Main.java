import com.cache.constants.EvictionPolicies;
import com.cache.model.Cache;
import com.cache.service.CacheService;

public class Main {

    public static void main(String[] args){
        CacheService cacheService = CacheService.getInstance();
        cacheService.init(10, EvictionPolicies.LRU);
        cacheService.put("Hello","world");
        System.out.println(cacheService.get("Hello"));
    }
}
