import java.util.Arrays;

/**
 * Created by kth919 on 2017-03-22.
 */
public class PermCheck {

    public static void main(String[] args){

        int[] A = new int[]{4, 1, 3};

        System.out.println(solution(A));
    }

    public static int solution (int [] A){

        int result = 1;

        Arrays.sort(A);

        for (int i =0; i<A.length; i++){

            if (A[i] != (i+1)){
                System.out.println("로그" + (i+1));
                result = 0;
                break;
            }

        }

        System.out.println(Arrays.toString(A));

        return result;
    }
}
