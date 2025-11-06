public class SearchInRowAndColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int num=29;
        System.out.println(SearchInRowAndColumnWiseSortedMatrix.linearSearch(arr,num));
        System.out.println(SearchInRowAndColumnWiseSortedMatrix.EfficientSearch(arr,num));
    }

    private static String EfficientSearch(int[][] arr, int num) {
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==num){
                return (i+1)+","+(j+1);
            }else if(arr[i][j]>num){
                j--;
            }else if(arr[i][j]<num){
              i++;
            }
        }
        return "not found";
    }

    private static String linearSearch(int[][] arr,int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return (i+1)+","+(j+1);
                }
            }
        }
        return "not found";
    }
}
