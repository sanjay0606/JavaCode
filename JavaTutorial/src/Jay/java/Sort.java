package Jay.java;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr={114,93,2,1,9,10,77,0};
        quick(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));

    }
    static void merge(int[] arr,int start,int end){

        if(end==start){

            return;

        }
        int mid=start+(end-start)/2;
        merge(arr,start,mid);
        merge(arr,mid+1,end);

        mergesort(arr,start,mid,end);


    }
    static void mergesort(int []arr,int start,int mid,int end){
        int[] a=new int[mid-start+1];
        int[] b=new int[end-mid];

        for(int i=0;i<a.length;i++){
            a[i]=arr[start+i];
        }
        for(int j=0;j<b.length;j++){
            b[j]=arr[mid+1+j];
        }
        int i=0;
        int j=0;
        int k=start;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                arr[k]=a[i];
                i++;
            }
            else {
                arr[k]=b[j];
                j++;
            }

            k++;

        }
       while(i<a.length){
            arr[k]=a[i];
             i++;
            k++;
        }
        while(j<b.length){
            arr[k]=b[j];
            j++;
            k++;
        }



    }

    static void quick(int[] arr,int start, int end){
        if(start<=end){
            int pivotIndex=quickSort(arr,start,end);
            System.out.println("---"+arr[pivotIndex]);
            System.out.println(pivotIndex);
            quick(arr,start,pivotIndex-1);
            quick(arr,pivotIndex+1,end);
        }
    }
    static int quickSort(int[] arr,int start,int end){
        int mid=start +(end-start)/2;
        int pivot=arr[mid];

            while(start<=end){
                while(arr[start]<pivot){
                    start++;
                }
                while(arr[end]>pivot){
                    end--;
                }
                if(start<=end){
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;

                    start ++;
                    end--;



                }



            }


//        System.out.println(pivot);



        return start-1;

    }
}
