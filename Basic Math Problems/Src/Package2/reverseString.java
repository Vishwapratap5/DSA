package Package2;

public class reverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] StrAr=str.split(" ");
        StringBuffer reversedString=new StringBuffer();
        for(int i=StrAr.length-1;i>=0;i--){
            reversedString.append(StrAr[i]).append(" ");
        }
        System.out.println(reversedString);

    }
}
