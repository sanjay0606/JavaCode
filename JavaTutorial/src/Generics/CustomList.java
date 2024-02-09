package Generics;

import java.util.Arrays;

public class CustomList<T> {

    Object[] data;
    private int size=0;
    private static int DEFAULTSIZE=10;

    public CustomList(){
        data=new Object[DEFAULTSIZE];
    }

    public void add(T num){
        if (this.isfull()) {
            this.resize();
        }
        data[size]=num;
        size++;
    }

    private boolean isfull(){
        return  size==data.length;
    }
    private void resize(){
        Object[] temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    @Override
    public String toString(){
        return "customarray"+Arrays.toString(data);
    }




}
