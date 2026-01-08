package ArrayImpl;

import java.util.Arrays;

public class DequeArray {
    int[] arr;
    int size;
    int capacity;
    int front;
    int rear;
    public DequeArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public boolean isFull() {
        return size == capacity;
    }
    public void pushFront(int data) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }
        front=(front-1+capacity)%capacity;
        arr[front]=data;
        size++;
    }
    public void pushRear(int data) {
        if (isFull()) {
            System.out.println("Deque is full");
            return;
        }
        arr[rear]=data;
        rear=(rear+1)%capacity;
        size++;
    }
    public int popFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        int data=arr[front];
        arr[front]=-1;
        front=(front+1)%capacity;
        size--;
        return data;
    }
    public int popRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        rear=(rear-1+capacity)%capacity;
        int data=arr[rear];
        arr[rear]=-1;
        size--;
        return data;
    }
    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[front];
    }
    public int peekRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        return arr[rear];
    }
    public void print() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        DequeArray deque = new DequeArray(10);
        System.out.println(deque.isEmpty());
        deque.pushFront(1);
        deque.pushRear(2);
        deque.pushFront(3);
        deque.pushRear(4);
        deque.print();
        deque.pushFront(5);
        deque.pushRear(6);
        deque.pushFront(7);
        deque.pushRear(8);
        deque.pushRear(9);
        deque.pushFront(10);
        deque.print();
        System.out.println(deque.isFull());
        System.out.println(deque.popFront());
        System.out.println(deque.popRear());
        System.out.println(deque.popFront());
        System.out.println(deque.popFront());
        System.out.println(deque.isEmpty());
        System.out.println(deque.isFull());
    }
}
