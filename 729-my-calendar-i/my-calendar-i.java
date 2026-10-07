class MyCalendar {

    List<int[]> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int startTime, int endTime) {

        for(int[] interval : list){

            int start1 = interval[0];
            int end1 = interval[1];

            // overlap
            if(startTime < end1 && start1 < endTime){
                return false;
            }
        }

        // no overlap with any existing booking
        list.add(new int[]{startTime, endTime});

        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */