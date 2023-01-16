package DSA.StringsPractice;
import java.util.ArrayList;

import static DSA.StringsPractice.PrintDupliChar.stringInput;
public class CountConsonantsVowels {

    static ArrayList<Character> arrayListGenerator(String str){
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for(int i=0;i<str.length();i++)
        {
            arrayList.add(str.charAt(i));
        }
        return arrayList;
    }

    static void counter(ArrayList<Character> vowels, String str ){
        int vcount=0;
        int ccount=0;
        for(int i =0; i <str.length();i++){
            if(vowels.contains(str.charAt(i))){
                vcount++;
            }else{
                ccount++;
            }
        }
        System.out.println("vcount = " + vcount);
        System.out.println("ccount = " + ccount);
    }
    public static void main(String[] args){
        String str= stringInput();
        counter(arrayListGenerator("aeiou"),str);
    }
}