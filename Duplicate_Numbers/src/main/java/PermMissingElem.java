import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by kth919 on 2017-03-20.
 */
public class PermMissingElem {

    public static void main(String[] args){
        int[] A = new int[]{1,2,3,5};
        System.out.print(solution(A));
    }

    public static int solution (int [] A){

        int result = 0;
        HashMap<Integer, Integer> sourceMap = new HashMap<Integer, Integer>();

        for (int i = 1; i<=A.length+1; i++){
            sourceMap.put(i , 0);
        }

        for (int k = 0; k<A.length; k++){
            if (sourceMap.containsKey(A[k])) {
                sourceMap.put(A[k], sourceMap.get(A[k]) + 1);
            }
        }

        Iterator<Integer> iterator = sourceMap.keySet().iterator();
             while (iterator.hasNext()) {
              int key = iterator.next();
              if (sourceMap.get(key) == 0) {
                  result = key;
              }
        }

        return result;
    }
}
