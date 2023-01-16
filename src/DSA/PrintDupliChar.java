package DSA;
// TODO:Complete using Hash Maps as well try using array for strings
import java.util.Scanner;

public class PrintDupliChar {

    static String input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input Text");
        String stri= in.nextLine();
        return stri;
    }

    static void runner(String str){
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(j));
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        String str=input();
        runner(str);
    }
}
