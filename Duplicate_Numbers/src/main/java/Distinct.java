import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by kth919 on 2017-03-30.
 */
public class Distinct {
    public  static void main(String[] args){
        int[] A = new int[]{2, 1, 1, 2, 3, 1};

        A[0] = 1;

        System.out.println("결과 : " + solution(A));

    }

    public static int solution (int [] A){

        int result = 0;
        HashMap<Integer, Integer> sourceMap = new HashMap<Integer, Integer>();

        for (int i = 0; i<A.length; i++){

            if (!sourceMap.containsKey(A[i])) {
                sourceMap.put(A[i] , 1);

            }else {
                sourceMap.put(A[i], sourceMap.get(A[i]) + 1 );

            }

        }

        Iterator<Integer> iterator = sourceMap.keySet().iterator();
        while (iterator.hasNext()) {

            int key = iterator.next();
            System.out.println(key + " : " + sourceMap.get(key));

            result += 1;

        }

        return result;
    }
}
