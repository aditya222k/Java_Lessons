package DSA;

import static DSA.PrintDupliChar.input;

public class FirstNonRepeatingCharacters {

    static char runner(String str){
        char fnr= ' ';
        for(int i=0; i<str.length(); i++){
            int counter=0;
            for(int j=i+1; j<str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                    break;
                }
                else{
                    fnr= str.charAt(i);
                }
            }
            if (counter==0){
                break;
            }
        }
        return fnr;
    }
    public static void main(String[] args){
        String str= input();
        System.out.println(runner(str));

    }
}
