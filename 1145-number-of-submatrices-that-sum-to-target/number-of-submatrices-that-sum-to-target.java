class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int count=0;

        for(int top=0;top<n;top++){
            int[] columnSum=new int[m];

            for(int bottom=top;bottom<n;bottom++){

                for(int i=0;i<m;i++){
                    columnSum[i]+=matrix[bottom][i];
                }

                int sum=0;
                HashMap<Integer,Integer> map=new HashMap<>();

                for(int i=0;i<m;i++){
                    sum+=columnSum[i];

                    if(sum==target){
                        count++;
                    }
                    if(map.containsKey(sum-target)){
                        count+=map.get(sum-target);
                    }
                    map.put(sum,map.getOrDefault(sum,0)+1);
                }
            }
        }
        return count;
    }
}