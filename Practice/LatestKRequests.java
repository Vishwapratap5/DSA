import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LatestKRequests {
    public static void main(String[] args) {
        LatestKRequests lkr = new LatestKRequests();
        String[] arr={"req1","req2","req3","req1","req3"};
        List<String> ans=lkr.getLatestKRequests(3,arr);
        System.out.println(ans);
    }

    public List<String> getLatestKRequests(int k, String [] requests) {
       ArrayDeque<String>  dequeue = new ArrayDeque<>();
        for (int i=requests.length-1; i>=0; i--) {
            if(k>0){
                if(!dequeue.contains(requests[i])) {
                    dequeue.offer(requests[i]);
                    k--;
                }
            }else{
                break;
            }
        }
        return new ArrayList<String>(dequeue);
    }

}
