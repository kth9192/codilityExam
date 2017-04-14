import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by kth919 on 2017-04-01.
 */
public class NumberOfDiscIntersections {

    public static void main(String[] args){

        int[] A = new int[]{};

        System.out.println("결과 : " + solution(A));
    }

    public static int solution (int [] A){

        int result = 0;

        int[] minRad = new int[A.length];
        int[] maxRad = new int[A.length];

        HashMap<Integer, Integer> minRadMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> maxRadMap = new HashMap<Integer, Integer>();

        int added_circle = 0;
        int tmp = 0;

        for (int i = 0; i<A.length; i++){

            minRad[i] = i - A[i];

            if (i + A[i] < 0 ){
                maxRad[i] = Integer.MAX_VALUE;
            }else {
                maxRad[i] = i + A[i];
            }

            if (!minRadMap.containsKey(minRad[i])) {
                minRadMap.put(minRad[i], 1);
            }
            else {
                minRadMap.put(minRad[i] , minRadMap.get(minRad[i])+1 );
            }

            if (!maxRadMap.containsKey(maxRad[i])){
            maxRadMap.put(maxRad[i] , 1);
            }else {
                maxRadMap.put(maxRad[i] , maxRadMap.get(maxRad[i])+1);

            }

        }

        Arrays.sort(minRad);
        Arrays.sort(maxRad);

        if (A.length != 0) {
            for (int i = minRad[0]; i <= maxRad[maxRad.length - 1]; i++) {

                if (minRadMap.containsKey(i) && i != minRad[0]) {

                    result += (added_circle * minRadMap.get(i));

                    if (minRadMap.get(i) > 1) {
                        for (int j = minRadMap.get(i) - 1; j >= 1; j--) {
                            tmp += j;
                        }
                        System.out.println("tmp" + tmp);
                        result += tmp;
                    }

                    added_circle += minRadMap.get(i);

                    tmp = 0;

                } else if (i == minRad[0]) {
                    added_circle = minRadMap.get(minRad[0]);
                }

                if (maxRadMap.containsKey(i)) {

                    added_circle = added_circle - maxRadMap.get(i);
                }
            }

            if (result > 10000000) {
                result = -1;
            }
        }
        return result;
    }
}

//    int result = 0;
//
//    long[] minRad = new long[A.length];
//    long[] maxRad = new long[A.length];
//
//        for (int i = 0; i<A.length; i++){
//
//        minRad[i] = (long)i - A[i];
//
//        maxRad[i] = (long)i + A[i];
//
//
//        }
//
//        for (int i = 0; i<A.length-1; i++){
//
//        for (int j = i+1; j<A.length; j++) {
//
//        if (maxRad[i] >= minRad[j] && minRad[i] <= maxRad[j]) {
//
//        result += 1;
//        }
//        }
//        }
//
//        if (result > 10000000){
//        result = -1;
//        }
//
//        return result;