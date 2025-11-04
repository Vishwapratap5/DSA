public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 10, 10, 10, 15, 15, 20};
        int[] arr2 = {5, 10, 10, 15, 30};

        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                j++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }

    }
}