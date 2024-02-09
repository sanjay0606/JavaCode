package Stack;

public class CustomStack {

    protected int[] data;

    public int ptr=-1;

    private static final int DEFAULTSIZE=10;
    public CustomStack() {
        this(DEFAULTSIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int num){

        if(isFull()){
            System.out.print("stack is full");
            return false;
        }

        ptr++;
        data[ptr]=num;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop from empty stack");
        }
        int removed=data[ptr];
        ptr--;

        return removed;
        // return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot peek from empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr==data.length-1;  //ptr is at last index
    }
    public boolean isEmpty(){
        return ptr==-1;  //ptr is at last index
    }
}
