package SubSet;

import java.util.ArrayList;

public class Question779 {
    public static void main(String[] args) {
        ArrayList<Integer> outerarr=new ArrayList<>();
        outerarr.add(0);
      System.out.println(make(1,4,outerarr));


    }
    public static ArrayList<Integer> make(int j,int limit,ArrayList<Integer> outerarr){
        if(j==limit){

            return outerarr;
        }


        ArrayList<Integer> list=new ArrayList<>();
        int size=2* outerarr.size();
        for(int i=0;i<outerarr.size();i++){

            list.add(outerarr.get(i));

        }
        for(int i= outerarr.size();i<size;i++){
            int num=outerarr.get(i- outerarr.size());
            if(num==0){
                list.add(1);
            }
            if(num==1){
                list.add(0);
            }

        }
        return make(j+1,limit,list);






    }
}
