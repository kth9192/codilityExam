
/**
 * Created by kth919 on 2017-04-18.
 */
public class MaxSliceSum {

    public static void main(String[] args){

        int[] A = new int[]{3, 2, -6, 4, 0};

        System.out.println("결과 : " + solution(A));
    }

    public static int solution (int [] A){
        int result = A[0];
        int tmp = A[0];

        for (int i = 1; i<A.length; i++){

            tmp = Math.max(A[i], tmp + A[i]);

            result = Math.max(result, tmp);
        }

        return result;
    }
}
