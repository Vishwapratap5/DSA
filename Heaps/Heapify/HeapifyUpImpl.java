package Heapify;

import java.util.ArrayList;


public class HeapifyUpImpl {
    static ArrayList<Integer> heap=new ArrayList<>();
    public static void main(String[] args) {
        HeapifyUpImpl heapify=new HeapifyUpImpl();
        heapify.add(10);
        heapify.add(20);
        heapify.add(30);
        heapify.add(40);
        heapify.add(50);
        heapify.add(60);
        heapify.add(5);
        System.out.println(heap);
        heapify.remove();
        System.out.println(heap);
    }

    private void heapifyUp(int i) {
        while(i>0) {
            int parent=(i-1)/2;
            if(heap.get(parent)>heap.get(i)) {
                int temp=heap.get(i);
                heap.set(i,heap.get(parent));
                heap.set(parent,temp);
                i=parent;
            }else{
                break;
            }
        }
    }
    private void add(int data) {
            heap.add(data);
           int current=heap.size()-1;
           heapifyUp(current);
    }
    private void heapifyDown(int i) {
        int right=(i+1)*2;
        int left=i*2+1;
        int min=i;

        if(left<heap.size() && heap.get(left)<heap.get(min)) {
            min=left;
        }
        if(right<heap.size() && heap.get(right)<heap.get(min)) {
            min=right;
        }
        if(min!=i) {
            int temp=heap.get(i);
            heap.set(i,heap.get(min));
            heap.set(min,temp);
            heapifyDown(min);
        }
    }
    private void remove() {
        int data=heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.set(heap.size()-1,data);

        heap.remove(heap.size()-1);
        heapifyDown(0);
    }
}
