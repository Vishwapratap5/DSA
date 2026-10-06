class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n=firstList.length;
        int m=secondList.length;

        int i=0;
        int j=0;

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();

        while(i<n && j<m){
            int start1=firstList[i][0];
            int end1=firstList[i][1];
            int start2=secondList[j][0];
            int end2=secondList[j][1];

            if(start1<=start2){
                if(start2<=end1){
                    ArrayList<Integer> res=new ArrayList<>();
                    int start=Math.max(start1,start2);
                    int end=Math.min(end1,end2);
                    res.add(start);
                    res.add(end);
                    list.add(res);
                }
            }else{
                if(start1<=end2){
                    ArrayList<Integer> res=new ArrayList<>();
                    int start=Math.max(start1,start2);
                    int end=Math.min(end1,end2);
                    res.add(start);
                    res.add(end);
                    list.add(res);
                }
            }
            if(end1<=end2){
                i++;
            }else{
                j++;
            }
        }
        
        int p=list.size();
        int[][] res=new int[p][2];

        for(int k=0;k<p;k++){
            res[k][0]=list.get(k).get(0);
            res[k][1]=list.get(k).get(1);
        }

        return res;
    }
}