import java.util.*;

public class SubArrayDivision {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(0,1,2);
//        System.out.println(birthday(list,4,2));
//        int[] arr={1, 3, 2, 6, 1, 2};
//        System.out.println(migratoryBirds(list));
        int[] arr={-1};
        System.out.println(circularArrayRotation(list1,2,list2)) ;
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int i=0;
        int j=0;
        int count=0;
        int sum=0;
        while(j<s.size()-m+1) {
            sum+=s.get(j);
            if(j-i+1<m){
                j++;
            }else if(j-i+1==m){
                if(sum==d){
                    count++;
                }
                i++;
                j++;
                sum-=s.get(i-1);
            }

        }
        return count;
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count=0;
        int sum=0;
        int remainder =0;
        int[] remainders = new int[ar.size()];
        for(int i=0;i<n;i++) {
            remainder =ar.get(i)%k;
            remainders[i]=remainder;
        }
        return -1;
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] frequency = new int[6];
        for(int bird:arr){
            frequency[bird]++;
        }
        int res=1;
        for(int i=2;i<6;i++) {
            if(frequency[i]>frequency[res]) {
                res=i;
            }
        }


        return res;

    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Collections.sort(ar);
        int pairCount=0;
        for(int i=0;i<ar.size()-1;i+=2){
            if(ar.get(i)==ar.get(i+1)){
                pairCount++;
            }else{
                i--;
            }
        }
        return pairCount;
    }

    public static int pageCount(int n, int p) {
        // Write your code here
       if(p==1) {
           return 0;
       }
       if(p==n && n%2==0) {
           return 1;
       }
       if(p==n-1 && n%2!=0) {
           return 0;
       }
       int frontCount=0;
       int backCount=0;

       for(int i=2;i<=n;i+=2) {
           if(i<=p){
               frontCount++;
           }
       }

        for(int i=n-1;i>1;i-=2) {
            if(i>p){
                backCount++;
            }
        }

        return Math.min(frontCount,backCount);
    }


    public static int countingValleys(int steps, String path) {
        // Write your code here
        int level=0;
        int count=0;
        boolean vallyStarted=false;
        boolean vallyEnded=false;
        for(int i=0;i<steps;i++){
            if(path.charAt(i)=='U'){
                level++;
            }else{
                level--;
            }
            if(level<0){
                vallyStarted=true;
            }
            

        }
        return count;
    }

    static String catAndMouse(int x, int y, int z) {

        int d1=Math.abs(z-x);
        int d2=Math.abs(z-y);

        if(d1==d2){
            return "Mouse C";
        }
        return (d1>d2)?"Cat B":"Cat A";
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int start=0;
        int end=0;
        double avg=0;
        double maxAvg=0;
        while(end<nums.length){
            sum+=nums[end];

            if(end-start+1<k){
                end++;
            }else if(end-start+1==k){
                avg=(double)sum/k;
                maxAvg=Math.max(avg,maxAvg);
                start++;
                end++;
                sum=sum-nums[start-1];
            }
        }
        return maxAvg;
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        Set<Integer> set=new TreeSet<>(ranked);
        LinkedList<Integer> list=new LinkedList<>(set);
        Collections.reverse(list);
        int i=list.size()-1;
        List<Integer> res=new ArrayList<>();
        for(int score:player){
            while(i>=0 && score>=list.get(i)){
                i--;
            }
            res.add(i+2);
        }
        return res;

    }


    public static int  strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        int i=0;
        int j=0;
        int startAt=-1;
        StringBuilder sb=new StringBuilder();
        while(j<haystack.length()-1){
            sb.append(haystack.charAt(j));
            if(j-i+1<needle.length()){
                j++;
            }else if(j-i+1==needle.length()){
                if(sb.toString().equals(needle)){
                    return i;
                }
                sb.deleteCharAt(needle.length()-j);
                i++;
                j++;
            }
        }
        return startAt;
    }

    public static int utopianTree(int n) {
        // Write your code here
        int hight=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                hight*=2;
            }else{
                hight+=1;
            }
        }
        return hight;
    }

    public static int beautifulDays(int i, int j, int k) {
        // Write your code here
        int dayCount=0;
        for(int m=i;m<=j;m++){
            int reverse=0;
            int current=m;
            while(current>0){
                int digit=current%10;
                current=current/10;
                reverse=reverse*10+digit;
            }
            if((Math.abs(reverse-m))%k==0){
                dayCount++;
            }
        }
        return dayCount;
    }

    public static int saveThePrisoner(int n, int m, int s) {
        // Write your code here
        int sweets=m;
        int prisoners=n;
        sweets=sweets%prisoners;
        return sweets+s-1;

    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here
        k=k%a.size();
        reverse(a, 0, a.size()-1);
        reverse(a,0,k-1);
        reverse(a,k,a.size()-1);

        List<Integer> list=new ArrayList<>();
        for(int i:queries){
            list.add(a.get(i));
        }
        return list;
    }

    public static void reverse(List<Integer> list,int i,int j){
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}
