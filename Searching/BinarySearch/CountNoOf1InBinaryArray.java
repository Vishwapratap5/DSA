public class CountNoOf1InBinaryArray {
    public static void main(String[] args) {
        int[] binArr={1,1,1,1,1,1};
        int target=1;
        int firstOccurance=FirstOccurance.findFirst(binArr,target);
        if(firstOccurance==-1){
            System.out.println("Nothing found");
        }else{
            System.out.println("Count of "+target+" is:"+(binArr.length-firstOccurance));
        }
    }
}
