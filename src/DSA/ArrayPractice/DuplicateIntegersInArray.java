package DSA.ArrayPractice;
import java.util.ArrayList;
import java.util.Scanner;
public class DuplicateIntegersInArray {
    static Scanner in = new Scanner(System.in);
    static ArrayList<Object> arrayListInput(){
        ArrayList<Object> arr=new ArrayList<>();
        boolean flag=true;
        while(flag){
            System.out.println("enter a number");
            String input= in.nextLine();
            if(input.isBlank()) {
                break;
            }else{
                arr.add(Integer.parseInt(input));
            }
        }
        return arr;
    }
    static int[] arrayInput(int n){
        boolean flag=false;
        int[] arr= new int[n];
        for(int i=0 ; i<n;i++){
            arr[i]=in.nextInt();
        }
        return arr;
    }

    static void duplicateCheckArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        int n= in.nextInt();
        int[] arr= arrayInput(n);
        duplicateCheckArray(arr);

    }
}
