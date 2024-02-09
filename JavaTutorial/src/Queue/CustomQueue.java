package Queue;

public class CustomQueue {

    public int[] data;

    int end=0;

    private static final int DEFAULTSIZE=10;
    public CustomQueue() {
        this.data = new int[DEFAULTSIZE];
    }

    public CustomQueue(int num) {
        this.data = new int[num];
    }

    public boolean isEmpty(){
        return end==0;
    }
    public boolean isFull(){
        return end==data.length;
    }

    public boolean insert(int num){
        if(isFull()){
            return false;
        }
        data[end]=num;
        end++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removedItem=data[0];
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }

        end--;

        return removedItem;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        return data[0];

    }

    public void display(){
        if(isEmpty()){
            System.out.print("empty queue ");
        }
        for(int i=0;i<end;i++){
            System.out.print(data[i] + "<---");
        }
        System.out.println("end");
    }
}
