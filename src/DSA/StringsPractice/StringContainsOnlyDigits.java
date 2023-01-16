package DSA.StringsPractice;
import static DSA.StringsPractice.PrintDupliChar.*;
import java.util.regex.*;
public class StringContainsOnlyDigits {
    static boolean withoutFunction(String str){
        for(int i =0; i< str.length();i++){
            if(str.charAt(i)<'0' || str.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }

    static boolean withFunction(String str){
        for(int i =0; i< str.length();i++){
            if(Character.isAlphabetic(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    static boolean usingRegex(String str){
        String Regex= "[0-9]+";
        Pattern p= Pattern.compile(Regex);
        Matcher m = p.matcher(str);
        return m.matches();
    }
    public static void main(String[] args){
        String str= input();
        System.out.println(usingRegex(str));
    }
}
