import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DNSCache {
    public static void main(String[] args) {
        DNSCache d = new DNSCache();
        String[] urls={"x", "x", "y", "x"};
        System.out.println(d.getMinTime(1,2,10,urls));
    }

    public int getMinTime(
            int cacheSize,
            int cacheTime,
            int serverTime,
            String[] urls){

        if(cacheSize == 0){
            return urls.length*serverTime;
        }

        Set<String> cache = new LinkedHashSet<String>();
        int totalTime = 0;

        for(String url : urls){
            if(cache.contains(url)){
                totalTime += cacheTime;

                cache.remove(url);
                cache.add(url);
            }else{
                totalTime+=serverTime;

                if(cache.size()==cacheSize){
                    String lru=cache.iterator().next();
                    cache.remove(url);
                }
                cache.add(url);
            }
        }
        return totalTime;

    }
}
