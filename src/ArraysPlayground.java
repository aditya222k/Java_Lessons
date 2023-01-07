import java.util.Scanner;
public class ArraysPlayground {
    static void singleDimensionalArray(){ //method for single dimensional array
        //static approach to creating an array
        int a[] = new int[5];
        //inserting elements into array
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;

        //dynamic approach to creating an array
        int b[] = {100,200,300,400,500};
        System.out.println(b.length);//size of array
        System.out.println(b[2]);//accessing elements of array

        //print all elements of array using for loop
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        //enhanced for loop
        for (int i:b)
        {
            System.out.println(i);
        }
    }
    static void multiDimensionalArray(){//method for Multi-dimensional Array
        int a[][] =new int[3][2];
        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        a[2][0]=500;
        a[2][1]=600;

        int b[][] = {{100,900},{300,400},{500,600}}; //dynamic approach to creating an array
        int number_rows= b.length;//number of rows
        int columns = b[0].length;//number of columns [0] is used to find number of rows
        //print all elements of array using for loop
        for(int i=0;i<b.length;i++){// i represents rows
            for(int j=0; j<b[i].length;j++){
                System.out.println(b[i][j]);
            }
        }
        //enhanced for loop
        for(int r[]:b){//r[] stores the number of rows in the array
            for(int i:r){ // variable i will get the column number after each run
                System.out.println(i);

            }
        }

    }
    static int[] inputAnArray(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter numbers");
        int sum=0;
        int arr []= new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void findingAnElement(){
        int arr[]= inputAnArray();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number to be searched");
        int num= sc.nextInt();

        boolean flag =false;
            for(int i:arr){
                if (i==num){
                    System.out.println("number found!");
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println("number not found!");
            }
        }
    static void sumOfElementOfArray(){
        int arr[]= inputAnArray();
        int sum=0;
        for(int i:arr){
            sum=sum+i;
        }
        System.out.println("sum = " + sum);
    }
    static void evenNumbersInArray(){
        int arr[]= inputAnArray();
        for(int i:arr){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
//        singleDimensionalArray();
//        multiDimensionalArray();
//        findingAnElement();
//        sumOfElementOfArray();
        evenNumbersInArray();
    }
}
