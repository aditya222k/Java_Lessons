package DSA.Stacks;

import java.util.ArrayList;


class Stack{
    static ArrayList<Integer> ar= new ArrayList<Integer>();

    static ArrayList<Integer> push(int n){
        ar.add(n);
        return ar;
    }
    static ArrayList<Integer> pop(){
        System.out.println("poped "+ar.get(ar.size()-1));
        ar.remove(ar.size()-1);
        return ar;
    }
    static int peak(){
        return ar.get(ar.size()-1);
    }
    static void display(){
        for(int i =ar.size()-1;i>=0;i--){
            System.out.println(ar.get(i));
        }

    }

}
public class StackImplementation {


    public static void main(String[]  args){
        Stack.push(1);
        Stack.push(37);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.pop();
        System.out.println(Stack.peak());
        Stack.display();
    }
}
