import java.util.Arrays;

/**
 * Created by kth919 on 2017-03-19.
 */
public class CyclicRotation {

    public static void main(String[] args){
        int[] a = new int[]{3,8,9,7,6};
        System.out.println(Arrays.toString(solution(a, 2)));
    }

   public static int [] solution(int[] A, int K){

       int[] source;

       int tmp;

       if(A.length >1) {
           for (int j = 0; j < K; j++) {
               tmp = A[A.length - 1];

               for (int i = A.length - 2; i >= 0; i--) {
                   A[i + 1] = A[i];
               }
               A[0] = tmp;
           }
       }

        source = A;
       return source;
   }
}
