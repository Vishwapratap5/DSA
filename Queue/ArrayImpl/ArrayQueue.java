package ArrayImpl;

import java.util.Arrays;

public class ArrayQueue {
    int[] arr;
    int size;
    int front;
    int rear;
    int capacity;
    public ArrayQueue(int capacity) {
        this.capacity= capacity;
        arr = new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    public boolean isEmpty() {
        return size==0;
    }
    public boolean isFull() {
        return size==capacity;
    }
    public void enQueue(int value) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        size++;
    }
    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data=arr[front];
        arr[front]=-1;
        front=(front+1)%capacity;
        size--;
        return data;
    }
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.deQueue());
        System.out.println(queue.size());
        System.out.println(queue.deQueue());
        System.out.println(queue.size());
        System.out.println(queue.deQueue());
        System.out.println(Arrays.toString(queue.arr));
    }
}
