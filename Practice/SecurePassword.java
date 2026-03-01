public class SecurePassword {
    public static void main(String[] args) {
        SecurePassword securePassword = new SecurePassword();
        String pwd="1100";
        System.out.println(securePassword.findChanges(pwd));
    }

    public int findChanges(String pwd){
        int len = pwd.length();

        if(len==0 || len%2!=0) return -1;
        int flip=0;
        for(int i=0;i<len;i+=2){
            if(pwd.charAt(i)!=pwd.charAt(i+1)){
                flip++;
            }
        }
        return flip;
    }
}
