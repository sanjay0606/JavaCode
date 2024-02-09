package SubSet;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String str="abcd";
        ArrayList<Integer> ans=new ArrayList();

//        System.out.println('2'-'0');
       System.out.print( permu("",str));
//        System.out.print( dice(4,0));
//        counthigh("abcd");



    }

    static ArrayList<String> permu(String p, String up){


        if(up.isEmpty()){
            ArrayList<String> lis=new ArrayList<>();


            lis.add(p);
            return lis;
        }
        ArrayList<String> list=new ArrayList<>();
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            list.addAll(permu(f+ch+s,up.substring(1)));
        }
        return list;
    }


    public static ArrayList<Integer> dice(int target, int ans){

        if(target==0){
          ArrayList<Integer>  list=new ArrayList<>();
          list.add(ans);

            return list;
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=target;i++){
            int res=0;


                res=ans*10 +i;
                
              list.addAll(dice(target-i,res)) ;

        }

        return list;



    }
    static void counthigh(String str){

        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        String newstr=new String(arr);
//        System.out.print(newstr);
        int i=0;
        int j=0;
        int count=0;
        int store=0;
        char ch=arr[0];
        while(i<arr.length){
            System.out.println(arr[i]);
//            System.out.println(count);
            if(arr[i]==arr[j]){
                count ++;
                if(store<count){
                    store=count;
                    ch=arr[j];

                }
            }
            if(arr[i]!=arr[j]){
                j=i;
                i=i-1;
                if(store<count){
                    store=count;

                }
                count=0;


            }


            i++;







        }
        System.out.println(store);
        System.out.println(ch);




    }
}
