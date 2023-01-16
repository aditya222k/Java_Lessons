package DSA.StringsPractice;
import java.util.Scanner;


import static DSA.StringsPractice.PrintDupliChar.input;

public class CountOccurrence {
    static int countOccurrence(String str,char ch){
        int counter=0;
        for(int i =0; i < str.length();i++){
            if(str.charAt(i)==ch){
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str= input();
        char ch =in.next().charAt(0) ;
        System.out.println(countOccurrence(str, ch));

    }
}
