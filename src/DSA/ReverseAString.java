package DSA;

import static DSA.PrintDupliChar.input;

public class ReverseAString {

    static String withoutRecursion(String str){
        String rev="";
        for(int i=str.length()-1; i>=0 ;i--){
            rev= rev + str.charAt(i);
        }
        return rev;
    }

    static void withRecursion(String str){
        if((str==null)||(str.length()<=1)){
            System.out.println(str);
        }else{
            System.out.println(str.charAt(str.length()-1));
            withRecursion(str.substring(0,str.length()-1));
        }
    }


    public static void main(String[] args){
        String str= input();
        withRecursion(str);
    }
}
