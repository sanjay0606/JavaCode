package Queue;

import javax.sound.midi.Soundbank;

public class CircularQueue {
    public int[] data;

    int end=0;
    int front=0;

    int size=0;

    private static final int DEFAULTSIZE=10;
    public CircularQueue() {
        this.data = new int[DEFAULTSIZE];
    }

    public CircularQueue(int num) {
        this.data = new int[num];
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==data.length;
    }

    public boolean insert(int num){
        if(isFull()){
            return false;
        }
        data[end]=num;
        end++;

        end=end%data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removedItem=data[front];
        front++;
        front=front%data.length;
        size--;

        return removedItem;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }

        return data[front];

    }

    public void display(){
        int i=front;
        if(isEmpty()){
            System.out.println("it is khaali");
            return;
        }
        do{
            System.out.print(data[i]+"-->");
            i++;
            i=i%data.length;
        }while(i!=end);
        System.out.println("end");
    }
}
