package DSA;
// TODO:Complete using Hash Maps as well
import java.util.Scanner;

public class PrintDupliChar {

    static String input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input Text");
        String stri= in.nextLine();
        return stri;
    }

    static char[] runner(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(j));
                }
            }
        }
        System.out.println(new char[0]);
        return new char[0];
    }

    public static void main(String[] args){
        String str=input();
        System.out.println(runner(str));
    }
}
