/**
 * Created by kth919 on 2017-03-21.
 */
public class TapeEquilibrium {

    public static void main(String[] args){
        int[] A = new int[]{3, 1, 2, 4, 3};
        System.out.println("결과 :" + solution(A) );
    }

    public static int solution(int[] A){

        int result = 0;
        int all = 0;
        int P = 0;
        int tmp;
        int source;

        for (int i =0; i<A.length; i++){
            all += A[i];
        }

        for (int i = 0; i< A.length - 1; i++){

            P += A[i];
            tmp = (P - all);

            source = P + tmp;

            if ( source < 0){
                source = -1*source;
            }

            if (i == 0 || result > source){
                result = source;
            }
        }

        return result;
    }
}
