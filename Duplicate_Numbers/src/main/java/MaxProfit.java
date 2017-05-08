import java.util.Arrays;

/**
 * Created by kth919 on 2017-04-17.
 */
public class MaxProfit {

    public static void main(String[] args){

        int[] A = new int[]{};

        System.out.println("결과 : " + solution(A) );
    }

    public static int solution(int[] A){

        int result = 0;
        int tmp = 0;

        if (A.length != 0 ) {
            tmp = A[A.length - 1];

            for (int i = A.length - 1; i > 0; i--) {

                if (tmp - A[i - 1] < 0) {
                    tmp = A[i - 1];
                } else {
                    if (result < tmp - A[i - 1]) {
                        result = tmp - A[i - 1];
                    }
                }

            }
        }

        return result;
    }

}
