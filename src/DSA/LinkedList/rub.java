package DSA.LinkedList;

public class rub {
    public static void main(String[] args){
        int[] arr={8,4,2,1};
        int count =0;
        for(int i=0; i<arr.length;i++){
            for(int j=1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }//run
        System.out.println(count);
    }
}
