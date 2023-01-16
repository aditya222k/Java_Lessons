package DSA.StringsPractice;

import static DSA.StringsPractice.PrintDupliChar.stringInput;
import static DSA.StringsPractice.ReverseAString.withoutRecursion;

public class PalindromeCheck {

    public static void main(String[] args){
        String str = stringInput();
        String str2 =withoutRecursion(str);
        if(str.equals(str2)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
