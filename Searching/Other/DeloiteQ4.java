public class DeloiteQ4 {
    public static void main(String[] args) {
        String str="xuuab";
        String Binary=DeloiteQ4.getResult(str);
        int sum=DeloiteQ4.getSum(Binary);
        System.out.println(sum);

    }

    private static int getSum(String str) {
        double digit;
        double sum=0;
        int j=0;
        for(int i=str.length()-1;i>=0;i--){
            digit=Math.pow(2,j);
            if(str.charAt(i)=='1'){
                sum+=digit;
            }
            j++;
        }
        return (int)sum;
    }

    private static String getResult(String str) {
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='a'||chars[i]=='u'||chars[i]=='o'||chars[i]=='i'||chars[i]=='e'){
                sb.append(0);
            }else{
                sb.append(1);
            }
        }
        return sb.toString();
    }
}
