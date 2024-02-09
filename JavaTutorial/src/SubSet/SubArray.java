package SubSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,1 };

        System.out.print(sub(arr));

    }

    static List<List<Integer>> sub(int[] arr){

        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i=0;i<arr.length;i++){
            int n=outer.size();
            for(int j=0;j<n;j++){
                List<Integer> list=new ArrayList<>(outer.get(j));
                list.add(arr[i]);
                outer.add(list);
            }

        }

        return outer;


    }
    static List<List<Integer>> subDup(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;

        for(int i=0;i<arr.length;i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
                List<Integer> list=new ArrayList<>(outer.get(j));
                list.add(arr[i]);
                outer.add(list);
            }

        }


        return outer;


    }
}
