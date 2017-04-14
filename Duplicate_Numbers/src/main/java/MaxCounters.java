import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by kth919 on 2017-03-25.
 */
public class MaxCounters {

    public static void main(String[] args){

        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};

        System.out.println("결과 : " + Arrays.toString(solution(5, A)));
    }

    public static int[] solution(int N, int[] A){

        int[] sourceA = new int[N];
        int[] result;
        int tmp = 0;
        int max = 0;

        Arrays.fill(sourceA, 0);

        for (int i = 0; i<A.length; i++){

            if (A[i] == N+1 ){
                max = tmp;

            }else {
                if (max > sourceA[A[i]-1])
                {
                    sourceA[A[i] - 1] = max + 1;

                }else {
                    sourceA[A[i] - 1] += 1;
                }

                if (sourceA[A[i] - 1] > tmp  ){
                    tmp = sourceA[A[i] - 1];
                }
            }
        }

        for (int i = 0; i<N; i++){

            if (sourceA[i] < max) {

                sourceA[i] = max;

            }
        }

        result = sourceA;

        return result;
    }
}
