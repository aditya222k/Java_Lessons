package DSA.ArrayPractice;
import static DSA.ArrayPractice.DuplicateIntegersInArray.*;

public class LargestSmallestInArray {

    static void minMax(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0 ; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            } else if (arr[i]<min) {
                min=arr[i];
            }
        }
        System.out.println(min+" "+max);
    }
    public static void main(String[] args){
        int n = in.nextInt();
        int[] arr=arrayInput(n);
        minMax(arr);
    }
}
