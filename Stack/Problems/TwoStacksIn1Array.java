import java.util.Arrays;

public class TwoStacksIn1Array {
    int[] stackArray=new int[10];
    int top1=-1;
    int top2=stackArray.length;
    public void push1(int data){

        if(top1<top2){
            stackArray[++top1]=data;
        }else{
            System.out.println("Stack1 Overflow");
            return;
        }
    }
    public void push2(int data){

        if(top1<top2){
            stackArray[--top2]=data;
        }else{
            System.out.println("Stack2 Overflow");
            return;
        }
    }
    public int pop1(){
        if(top1==-1){
            System.out.println("Stack1 is Empty");
            return Integer.MIN_VALUE;
        }

            int temp=stackArray[top1];
            stackArray[top1]=-1;
            top1-=1;
            return temp;

    }
    public int pop2(){
        if(top2==stackArray.length){
            System.out.println("Stack1 is Empty");
            return Integer.MIN_VALUE;
        }

        int temp=stackArray[top2];
        stackArray[top2]=-1;
        top2+=1;
        return temp;
    }
    public int peek1(){
        if(top1==-1){
            System.out.println("Stack1 is Empty");
            return -10;
        }
        return stackArray[top1];
    }
    public int peek2(){
        if(top2==stackArray.length){
            System.out.println("Stack2 is Empty");
            return -20;
        }
        return stackArray[top2];
    }
    public boolean isStack1Empty(){
        return top1==-1;
    }
    public boolean isStack2Empty(){
        return top2==stackArray.length;
    }
    public int size1(){
        return (top1+1);
    }
    public int size2(){
        return (stackArray.length-top2);
    }
    public static void main(String[] args) {
        TwoStacksIn1Array stack=new TwoStacksIn1Array();
        stack.push1(1);
        stack.push2(2);
        stack.push1(3);
        stack.push2(4);
        stack.push1(5);
        stack.push2(6);
        stack.push1(7);
        stack.push2(8);
        stack.push1(9);
        stack.push2(10);
        System.out.println(stack.isStack1Empty());
        System.out.println(stack.isStack2Empty());
        System.out.println(stack.peek1());
        System.out.println(stack.peek2());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        System.out.println(stack.peek1());
        System.out.println(stack.peek2());
        System.out.println(Arrays.toString(stack.stackArray));
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        System.out.println(stack.peek1());
        System.out.println(stack.peek2());
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        System.out.println(stack.peek1());
        System.out.println(stack.peek2());
        System.out.println(stack.size1());
        System.out.println(stack.size2());
        System.out.println(Arrays.toString(stack.stackArray));
    }
}
