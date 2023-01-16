package DSA.ArrayPractice;

import static DSA.ArrayPractice.DuplicateIntegersInArray.arrayInput;
import static DSA.ArrayPractice.DuplicateIntegersInArray.in;

public class AverageOfArray {
    static float averageCalc(int[] arr){
        int average=0;
        for(int i =0; i<arr.length;i++){
            average+=arr[i];
            System.out.println(average);
        }
        return average/arr.length;
    }
    public static void main(String[] args){
        int n = in.nextInt();
        int[] arr=arrayInput(n);
        System.out.println(averageCalc(arr));

    }
}
