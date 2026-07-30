class Solution {
    public int compareVersion(String version1, String version2) {

        String[] v1=version1.split("\\.");

        String[] v2=version2.split("\\.");

        int i=0;
       int j=0;
        int n=v1.length;
        int m=v2.length;
       while(i<n && j<m){
            int num1=Integer.parseInt(v1[i]);
            int num2=Integer.parseInt(v2[j]);

            if(num1==num2){
                i++;
                j++;
            }else if(num1>num2){
                return 1;
            }else{
                return -1;
            }
       } 

       if(i==n && j<m){
           int num1=0;

            while(j<m){
              int num2=Integer.parseInt(v2[j]);
              if(num1==num2){
                    j++;
                }else if(num1>num2){
                    return 1;
                }else{
                    return -1;
                }
            }

       }

       if(i<n && j==m){
           int num2=0;

            while(i<n){
              int num1=Integer.parseInt(v1[i]);
              if(num1==num2){
                    i++;
                }else if(num1>num2){
                    return 1;
                }else{
                    return -1;
                }
            }
       }

    return 0;

    }
}