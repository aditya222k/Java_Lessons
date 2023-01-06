import java.util.Arrays;
import java.util.Scanner;
public class String_Playground {
    public static void reverseAString(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println(rev);
    }
    public static void stringPresentInArray(){
        Scanner sc = new Scanner(System.in);
        String s[]= new String[5];
        for(int i=0;i<5;i++){
            s[i] = sc.nextLine();// TODO:check of other ways to input strings
        }
        String search="hello";
        boolean flag=false;
        for(String i:s){
            if(i.equals(search)){
                flag=true;
                System.out.println("String found in array");
                break;
            }
        }
        if(!flag){
            System.out.println("String not found in array");
        }
    }
    public static void main(String[] args){
//        reverseAString();
        stringPresentInArray();
    }
}

//TODO:1) Write a java program to compare two strings, ignoring case differences.
//TODO:2) Write a Java program to concatenate a given string to the end of another string.
//TODO:3) Write a java program to get the length of a given string
//TODO:4) Write a Java program to get a substring of a given string between two specified positions
//TODO:5) Write a Java program to convert all the characters in a string to uppercase.
//TODO:6) Write a Java program to convert all the characters in a string to lowercase
