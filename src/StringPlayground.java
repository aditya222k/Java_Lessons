import java.util.Scanner;
public class StringPlayground {
//    public static void inputString(){
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
    public static void compareString(){ // method to compare two strings ignoring the case
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Strings are same");
        }else{
            System.out.println("Strings are not same");
        }
    }
    public static void subString(){ // method to get a substring between two given index
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int i = sc.nextInt();//starting index
        int j = sc.nextInt();//ending index
        System.out.println(s1.substring(i, j));
    }
    public static void main(String[] args){
        reverseAString();
        stringPresentInArray();
        compareString();
        subString();
    }
}

