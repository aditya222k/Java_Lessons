package BugFixPractice;

public class TriangleUtilities {
    static public double getArea(int base, int height){
        return 0.5*base*height;
    }

    static int getPerimeter(int sideA, int sideB, int sideC){
        return sideA+sideB+sideC;
    }

    public static boolean isEquilateral(int sideA, int sideB, int sideC) {
        return (sideA==sideB && sideB==sideC);
    }
}
