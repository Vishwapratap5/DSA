import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class IndexNode{
    int index;
    IndexNode next;
    public IndexNode(int index){
        this.index = index;
        next = null;
    }
}

public class NStacks {
    int[] NStackArray;
    LinkedList<IndexNode>[] storedIndexes;
    Deque<Integer> emptyPositions=new ArrayDeque<>();
    public NStacks(int size,int numberOfStacks){
        NStackArray = new int[size];
        Arrays.fill(NStackArray,-1);
        storedIndexes=new LinkedList[numberOfStacks];
        for(int i = 0; i < numberOfStacks; i++){
            storedIndexes[i] =new LinkedList<IndexNode>();
        }
        for(int i = 0; i < size; i++){
                emptyPositions.push(i);
        }
    }
    public void push(int data,int stackNumber){
        if(emptyPositions.isEmpty()){
            System.out.println("All Stacks are full");
            return;
        }
        int index = emptyPositions.pop();
        NStackArray[index] = data;
       storedIndexes[stackNumber].addFirst(new IndexNode(index));
    }
    public int pop(int stackNumber){
        if(storedIndexes[stackNumber].isEmpty()){
            System.out.println("this Stack is empty");
            return -1;
        }
        int index=storedIndexes[stackNumber].peek().index;
        int data=NStackArray[index];
        NStackArray[index]=-1;
        emptyPositions.push(index);
        storedIndexes[stackNumber].removeFirst();
        return data;
    }
    public int peek(int stackNumber){
        if(storedIndexes[stackNumber].isEmpty()){
            System.out.println("this Stack is empty");
            return -1;
        }
        int index=storedIndexes[stackNumber].peek().index;
        return NStackArray[index];
    }
    public int size(int stackNumber){
        return storedIndexes[stackNumber].size();
    }
    public boolean isEmpty(int stackNumber){
        return storedIndexes[stackNumber].isEmpty();
    }
    public static void main(String[] args) {
        NStacks nStacks = new NStacks(5,3);
        nStacks.push(1, 0);
        nStacks.push(2, 1);
        nStacks.push(3, 2);
        System.out.println( nStacks.pop(2));
        System.out.println(Arrays.toString(nStacks.storedIndexes));
    }
}


