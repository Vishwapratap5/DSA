public class CountOcurance {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,4,5,6,6,6,8};
        int target = 8;
        int firstOccurance=FirstOccurance.findFirst(arr,target);
        int lastOcurance=LastOccurance.findLast(arr,target);
        if(firstOccurance==-1){
            System.out.println("Nothing found");
        }else{
            System.out.println("Count of "+target+" is:"+(lastOcurance-firstOccurance+1));
        }
    }
}
