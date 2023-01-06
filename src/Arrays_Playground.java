public class Arrays_Playground {
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

    }
    public static void main(String[] args) {
        singleDimensionalArray();
        multiDimensionalArray();
    }
}
