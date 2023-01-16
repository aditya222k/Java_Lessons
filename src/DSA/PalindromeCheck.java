package DSA;

import static DSA.PrintDupliChar.input;
import static DSA.ReverseAString.withoutRecursion;

public class PalindromeCheck {

    public static void main(String[] args){
        String str =input();
        String str2 =withoutRecursion(str);
        if(str.equals(str2)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
