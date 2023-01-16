package DSA.ArrayPractice;
import static DSA.ArrayPractice.DuplicateIntegersInArray.in;


public class TransposingAMatrix {
    static int[][] matrixInput(){
        System.out.println("enter rows");
        int m= in.nextInt();
        System.out.println("enter Columns");
        int n= in.nextInt();
        int[][] matrix= new int[m][n];
        for(int i= 0; i<m;i++){
            for(int j=0; j<n;j++){
                matrix[i][j]=in.nextInt();
            }
        }
        return matrix;
    }

    static void transpose(int[][] matrix){
        System.out.println("matrix.length = " + matrix.length);
        System.out.println("matrix[1].length = " + matrix[1].length);
            System.out.println("without transpose");
        for (int i=0; i<matrix.length;i++){
            for (int j=0; j<matrix[1].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
            System.out.println("with transpose");
        for (int i=0; i<matrix.length;i++){
            for (int j=0; j<matrix[1].length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println("");
        }

    }
    public static void main(String[] args){
        transpose(matrixInput());
    }
}
