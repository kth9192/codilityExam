import java.util.Arrays;

/**
 * Created by kth919 on 2017-03-31.
 */
public class MaxProductOfThree {

    public static void main(String[] args){
        int[] A = new int[]{-3, -1, 400, -2, -5, -6};

        System.out.println("결과 : " + solution(A));
    }

    public static int solution (int [] A){
        int result = 0;
        int tmp = 0;

        Arrays.sort(A);

        for (int i =0; i<A.length-2; i++){
            if (i == 0){
                tmp = A[i] * A[i+1] * A[i+2];
            } else {
                if (tmp < A[i] * A[i+1] * A[i+2]){

                    tmp = A[i] * A[i+1] * A[i+2];

                }
            }

            if (A[i] < 0 && A[i+1] < 0){
                if (tmp < A[i] * A[i+1] * A[A.length-1] ) {
                    tmp = A[i] * A[i + 1] * A[A.length - 1];
                }
            }
        }

        result = tmp;

        return result;
    }
}
