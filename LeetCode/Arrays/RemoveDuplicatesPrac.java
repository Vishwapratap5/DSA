import java.util.*;

public class RemoveDuplicatesPrac {

    public static void main(String[] args) {
        int[] nums={0,2,1,4,7,3,2,5,7,1};
        RemoveDuplicatesPrac test = new RemoveDuplicatesPrac();
//        System.out.println(test. removeDuplicates(nums));
//        System.out.println(Arrays.toString(nums));
//        int[] res=test.twoSum(nums,6);
//        test.moveZeroes(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println( test.isPalindrome("A man, a plan, a canal: Panama"));
//        List<List<Integer>> list=test.threeSum(nums);
//        System.out.println(list);
//        int[] res=test.sortedSquares(nums);
//        System.out.println(Arrays.toString(res));
        System.out.println(test.MaxPeek(nums));
    }

    private int[] twoSum(int[] arr,int target) {
        int i=0;
        int j=arr.length-1;
        int[] res=new int[2];
        while(i<j){
            if(arr[i]+arr[j]>target){
                j--;
            }else if(arr[i]+arr[j]<target){
                i++;
            }else{
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
        }
        return res;
    }

    public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;
        int n=arr.length;
        while(j<n){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
            j++;
        }
    }

    public boolean isPalindrome(String s) {
       int i=0;
       int j=s.length()-1;
       String str=s.toLowerCase();
       String[] arr=str.split(" ");
       while(i<j){
           char ch1=str.charAt(i);
           char ch2=str.charAt(j);
           if(!Character.isLetterOrDigit(ch1)){
               i++;
           }else if(!Character.isLetterOrDigit(ch2)){
               j--;
           }else{
               if(str.charAt(i)!=str.charAt(j)){
                   return false;
               }
               i++;
               j--;
           }

       }
       return true;

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int i;
        int j;
        List<Integer> res;
      for(int k=0;k<nums.length;k++){
          int remaining=-nums[k];
          i=k+1;
          j=nums.length-1;
          while(i<j){
              if(nums[i]+nums[j]>remaining){
                  j--;
              }else if(nums[i]+nums[j]<remaining){
                  i++;
              }else{
                  res=new ArrayList<>();
                  res.add(nums[k]);
                  res.add(nums[i]);
                  res.add(nums[j]);
                  list.add(res); 
                  i++;
                  j--;
              }
          }
      }
        return list;
    }

    public int[] sortedSquares(int[] nums) {
        int[] temp=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int k=nums.length-1;k>=0;k--){

            if(i<=j){

                if(Math.abs(nums[i])>=Math.abs(nums[j])){
                    temp[k]=nums[i]*nums[i];
                    i++;
                }else if(Math.abs(nums[i])<=Math.abs(nums[j])){
                    temp[k]=nums[j]*nums[j];
                    j--;
                }
            }

        }
        return temp;
    }



    public int removeDuplicates(int[] nums) {

        int i=0;
        int j=1;
        while(i<nums.length-1){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return j;
    }

    public int lengthOfLongestSubstring(String s) {

        int maxCount=0;
        int left=0;
        int right=0;
        Set<Character> set=new HashSet<>();
        for(;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxCount=Math.max(maxCount,(right-left+1));
        }
        return maxCount;
    }

    public int MaxPeek(int[] arr){
        int maxPeekLength=0;
        int n=arr.length;

        if(n<3){
            return 0;
        }

        int left=0;
        int right=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]<arr[i+1]){}
        }
    }


}
