package DSA.StringsPractice;

import static DSA.StringsPractice.PrintDupliChar.stringInput;
import static DSA.StringsPractice.ReverseAString.withoutRecursion;

public class PalindromeCheck {

    static void reverserPallin(String str){
        String str2 =withoutRecursion(str);
        if(str.equals(str2)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    static void pointerReverse(String str){
        int i=0;
        int j = str.length()-1;
        boolean flag =true;
        while(i<=j){
            if(str.charAt(i)==' '){
                i++;
                continue;
            }else if(str.charAt(j)==' '){
                j--;
                continue;
            }else if(str.charAt(i)!=str.charAt(j)){
                flag=false;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void main(String[] args){
        String str = stringInput();
        pointerReverse(str);
    }
}
