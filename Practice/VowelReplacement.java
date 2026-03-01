import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelReplacement {
    public static void main(String[] args) {
        VowelReplacement str=new VowelReplacement();
//        System.out.println(str.replaceVowels("bmt"));
//        System.out.println(kangaroo(14,4,98,2));
        List<Integer> input= Arrays.asList(10 ,5, 20, 20, 4, 5 ,2 ,25, 1);
        List<Integer> list=breakingRecords(input);
        System.out.println(list);
    }

    public String replaceVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o'){
                pos=i;
                break;
            }
            sb.append(c);
        }
        if(pos==0){
            return sb.toString()+"ay";
        }else{
            String subString = s.substring(pos);
            String res=subString+(sb.toString()+"ay");
            return res;
        }

    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int m=v1;
        int n=v2;
        while(m!=n){
            if(n>m){
                n=n-m;
            }else{
                m=m-n;
            }
        }
        int GCD=m;
        int LCM=v1*v2/GCD;
        int jump1=x1;
        int jump2=x2;
       for(int i=1;i<=LCM;i++){
           jump1+=v1;
           jump2+=v2;
           if(jump1==jump2){
               return "YES";
           }
       }
       return "NO";

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int minimumScore=scores.get(0);
        int maximumScore=scores.get(0);
        int maxScoreCount=0;
        int minScoreCount=0;
        for(int i=1;i<scores.size();i++){
            int score=scores.get(i);
            if(score>maximumScore){
                maximumScore=score;
                maxScoreCount++;
            }

            if(score<minimumScore){
                minimumScore=score;
                minScoreCount++;
            }
        }

        List<Integer> res=new ArrayList<>();
        res.add(maxScoreCount);
        res.add( minScoreCount);
        return res;
    }

}
