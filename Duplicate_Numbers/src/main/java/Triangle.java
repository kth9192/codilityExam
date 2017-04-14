import java.util.Arrays;

/**
 * Created by kth919 on 2017-03-31.
 */
public class Triangle {

    public static void main(String[] args){

        int[] A = new int[]{Integer.MAX_VALUE/2, Integer.MAX_VALUE/2 +1 , Integer.MAX_VALUE/2 +2};

        System.out.println("결과 : " + solution(A));
    }

    public static int solution (int [] A){
        int result = 0;

        Arrays.sort(A);

        if (A.length >= 3) {
            for (int i = 0; i < A.length - 2; i++) {
                if (A[i + 2] < (long)(A[i] + A[i + 1]) ) {

                   result = 1;

                    break;
                }
            }
        }

        return result;
    }
}
