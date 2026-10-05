class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
       int start=0;
       int end=0;
        for(int x:timeSeries){
           start=x;
           end=x+duration-1;
           ArrayList<Integer> res=new ArrayList<>();
           res.add(start);
           res.add(end);
           list.add(res);
        }
         ArrayList<ArrayList<Integer>> res=mergeIntervals(list);
         int diff=0;

         for(ArrayList<Integer> x:res){
            diff+=x.get(1)-x.get(0)+1;
         }
         return diff;
    }

    public  ArrayList<ArrayList<Integer>> mergeIntervals(ArrayList<ArrayList<Integer>> list){
        
        list.sort(Comparator.comparingInt(innerList -> innerList.get(0)));
        int start1=list.get(0).get(0);
        int end1=list.get(0).get(1);
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();

        for(int i=1;i<list.size();i++){
            int start2=list.get(i).get(0);
            int end2=list.get(i).get(1);

            if(start2<=end1){
                end1=Math.max(end1,end2);
            }else{
                ArrayList<Integer> res1=new ArrayList<>();
                res1.add(start1);
                res1.add(end1);
                res.add(res1);
                start1=start2;
                end1=end2;
            }
        }
                ArrayList<Integer> res1=new ArrayList<>();
                res1.add(start1);
                res1.add(end1);
                res.add(res1);
        return res;
    }
}