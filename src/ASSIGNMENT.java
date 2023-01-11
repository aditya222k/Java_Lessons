import java.lang.reflect.Array;
import java.util.HashMap;

public class ASSIGNMENT {

    static void count_coins(int amt){
        HashMap<Integer,Integer> counter = new HashMap<Integer,Integer>();
        int coins[] = {25,10,5,2,1};
        for(int i:coins){
            int count =0;
            while(amt>=i){
                amt= amt-i;
                count++;
            }
            counter.put(i,count);
        }
        System.out.println(counter);
    }
    public static void main(String [] args){
        count_coins(46);
    }
}
