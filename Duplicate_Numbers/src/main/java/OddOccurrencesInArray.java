
import java.util.*;

/**
 * Created by kth919 on 2017-03-18.
 */
public class OddOccurrencesInArray {

    public static void main(String[] args){
        int[] a = {9,3,9,3,9,7,9};
        solution(a);
    }
    public static int solution(int[] A) {

        HashMap<Integer, Integer> sourceMap = new HashMap<Integer, Integer>();
        int source = 0;

        for (int a : A) {
            if (sourceMap.containsKey(a)){
                sourceMap.put(a, sourceMap.get(a)+1 );
                System.out.println("중복" + a);

            }
            else  {
                sourceMap.put(a, 1);
                System.out.println("더하는중" + a);
            }
        }

        for (int i : A){
            if (sourceMap.get(i)%2 == 1){
                source = i;
            }
        }

        System.out.print("로그" + source);
        return source;
    }
}


