package linerSearch;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
//        palin("","geeks");
//        int[] arr={1,2,3,1 };
//        System.out.print(subs(arr));
        ArrayList<Integer> result=new ArrayList<>();
        int[] candidates = {2,3,5};
        int target=8;
        ArrayList<Integer> lis=new ArrayList<>();
       System.out.println(helper(candidates,target,lis));




    }
    public static void palin(String p,String up){
        if(up.isEmpty()){
            if(check(p)){
                System.out.println(p);
            }

            return;
        }
        char c=up.charAt(0);

        palin(p+c,up.substring(1));
        palin(p,up.substring(1));
    }
    public static boolean  check(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;

    }
    public static ArrayList<ArrayList<Integer>> subs(int[] arr){

        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i=0;i<arr.length;i++){
            int n=outer.size();
            for(int j=0;j<n;j++){
                ArrayList<Integer> list=new ArrayList<>(outer.get(j));
                list.add(arr[i]);
                outer.add(list);
            }

        }

        return outer;

    }
    public static ArrayList<ArrayList<Integer>> helper(int[] candidates,int target,ArrayList<Integer>  ans){
        if(target==0){
          ArrayList<ArrayList<Integer>>   list=new ArrayList<>();
            list.add(ans);

//            System.out.print("0");
            return list;
        }
        if(target<0){

            return new ArrayList<>();
        }
        ArrayList<ArrayList<Integer>>   list=new ArrayList<>();
        for(int i=0;i<candidates.length;i++){
            ArrayList<Integer> arr=new ArrayList<>();
            arr.addAll(ans);
//            System.out.println(arr);
            arr.add(candidates[i]);






           list.addAll( helper(candidates,target-candidates[i],arr));
        }
        return list;

    }
    static int[] slice(int []arr){
        int[] array=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            array[i-1]=arr[i];
        }
        return array;

    }
}

