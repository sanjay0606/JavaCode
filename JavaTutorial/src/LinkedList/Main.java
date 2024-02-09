package LinkedList;

import org.w3c.dom.Node;

public class Main {
    public static void main(String[] args) {
        Linked list1=new Linked();
        Linked list2=new Linked();
        list1.insertAtFirst(8);
        list1.insertAtFirst(6);
        list1.insertAtFirst(5);
        list1.insertAtFirst(4);

//        list1.display();
        System.out.println("");
        list2.insertAtFirst(7);
        list2.insertAtFirst(3);
        list2.insertAtFirst(2);
        list2.insertAtFirst(1);
//        list2.display();
        int[] arr={5,4,3,21,1};
        bubblesort(arr,4,0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }





        ;

//        list.insert(1,3);







    }
    public static void bubblesort(int[] arr,int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }

            bubblesort(arr,row,col+1);


        }

        bubblesort(arr,row-1,0);

    }



}
