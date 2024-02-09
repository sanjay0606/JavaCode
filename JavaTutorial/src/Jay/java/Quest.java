package Jay.java;

import java.util.ArrayList;

public class Quest {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        String str="abc";
     System.out.print(subseq(str,"",list));
//        System.out.print('b'+0);


    }
    static String skip(String str){

        if(str.isEmpty()){

            return "";
        }

        if(str.startsWith("apple")){
           return skip(str.substring(5));
        }
        else{
           return str.charAt(0) + skip(str.substring(1));
        }


    }
    static String skipApp(String str){

        if(str.isEmpty()){

            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipApp(str.substring(3));
        }
        else{
            return str.charAt(0) + skipApp(str.substring(1));
        }


    }
    static ArrayList<String> subseq(String str, String ans,ArrayList<String> list ){
        if(str.isEmpty() ){
            list.add(ans);
            return list;
        }
        char ch=str.charAt(0);
        subseq(str.substring(1),ans + ch,list);
        subseq(str.substring(1),ans,list);

       return list;

    }

    static ArrayList<String> subseq1(String str, String ans){
        ArrayList <String> list=new ArrayList<>();
        if(str.isEmpty() ){
            list.add(ans);
            return list;
        }
        char ch=str.charAt(0);
       list.addAll(subseq1(str.substring(1),ans + ch)) ;
        list.addAll(subseq1(str.substring(1),ans  ));

        return list;

    }
    static void subseqA(String str, String ans){
        if(str.isEmpty() ){
            System.out.println(ans);
            return;

        }
        char ch=str.charAt(0);
        subseqA(str.substring(1),ans + ch);
        subseqA(str.substring(1),ans);
        subseqA(str.substring(1),ans + (ch+0));



    }


}
