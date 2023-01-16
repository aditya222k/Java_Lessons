package DSA.StringsPractice;

import static DSA.StringsPractice.PrintDupliChar.stringInput;

public class ConvertStrToCharArray {
    public static void main(String[] args){
        String str = stringInput();
        char[] ch =new char[str.length()];
        char[] ch1=new char[str.length()];
        for(int i =0 ; i < str.length();i++){
            ch[i] = str.charAt(i);
        }
        ch1=str.toCharArray();
        for (int i =0; i< ch.length; i++) {
            System.out.println(ch[i]);
            ch[i]='0';
        }for (int i =0; i< ch1.length; i++) {
            System.out.println(ch1[i]);
            ch1[i]='0';
        }
    }

}
