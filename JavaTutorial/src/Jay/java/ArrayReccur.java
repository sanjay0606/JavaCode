package Jay.java;

import java.util.ArrayList;

public class ArrayReccur {
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};

        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.print(search(arr,7,0,7));

    }

    public static boolean sorted(int[] arr,int index){
        if(index== arr.length-1){
            return true;
        }


        return arr[index]<arr[index+1] && sorted(arr,index+1);


    }
    public static ArrayList linear(int[] arr, int target, int index,ArrayList<Integer> list){
        if(index== arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return linear(arr,target,index+1,list);
    }
    public static ArrayList linear2(int[] arr, int target, int index){
        ArrayList<Integer> set=new ArrayList<>();
        if(index== arr.length){
            return set;
        }
        if(arr[index]==target){
            set.add(index);
        }
        ArrayList<Integer> ans=linear2(arr,target,index+1);

        set.addAll(ans);
        return set;
    }
    public static int search(int [] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){

            if(target>=arr[s] && target<=arr[mid]){
                return search(arr,target,s,mid-1);
            }
            else{
                return search(arr, target, mid + 1, e);
            }
        }
        if(target>=arr[mid] && target<arr[e]){
           return search(arr,target,mid+1,e);
        }
       return search(arr,target,s,mid-1);

    }
}
