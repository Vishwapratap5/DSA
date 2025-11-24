import java.util.Arrays;

public class LeftMostNonRepeatingChar2 {
    public static void main(String[] args) {
        String str="geeksforgeeks";
        System.out.println(LeftMostNonRepeatingChar2.find(str));
    }

    private static int find(String str) {
        int[] visited = new int[256];
        Arrays.fill(visited, -1);
        int res=Integer.MAX_VALUE;
        for(int i=0; i<str.length(); i++) {
            if(visited[str.charAt(i)]==-1) {
                visited[str.charAt(i)]=i;
            }else{
                visited[str.charAt(i)]=-2;
            }
        }
        for(int i=0;i<256;i++) {
            if(visited[i]>=0) {
                res=Math.min(res,visited[i]);
            }
        }
        return (res==Integer.MAX_VALUE?-1:res);
    }
}
