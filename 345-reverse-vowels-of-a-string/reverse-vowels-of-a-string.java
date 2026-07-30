class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        int n=s.length();
        int end=n-1;
        Set<Character> set=new HashSet<>(List.of('a','e','i','o','u','A','E','I','O','U'));
        while(start<=end){
            if(set.contains(arr[start]) && set.contains(arr[end])){
                char temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }else if(!set.contains(arr[start])){
                start++;
            }else if(!set.contains(arr[end])){
                end--;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char x:arr){
            sb.append(x);
        }
        return sb.toString();
    }
}