package Package2;

public class MooreVotingAlgorithm {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,3,3};
        int Candidate=MooreVotingAlgorithm.findCandidate(arr);
        int isMaxCandidate=MooreVotingAlgorithm.isMax(Candidate,arr);
        if(isMaxCandidate!=-1){
            System.out.println(isMaxCandidate);
        }else{
            System.out.println("No Max candidate found");
        }
    }

    private static int isMax(int candidate,int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==candidate){
                count++;
            }
        }
        if((count>=arr.length/2)){
            return candidate;
        }else{
            return -1;
        }
    }

    private static int findCandidate(int[] arr) {
        int count=0;
        int candidate =0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                candidate=arr[i];
            }
            if(arr[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }

}
