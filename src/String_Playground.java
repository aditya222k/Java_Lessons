import java.util.Scanner;
public class String_Playground {
    public static void reverseAString(){
        String s ="hello";
        String rev ="";
        for(int i=s.length()-1;i>=0;i--){
            rev = rev+s.charAt(i);
        }
        System.out.println(rev);
    }
    public static void main(String[] args){
        reverseAString();
    }
}
