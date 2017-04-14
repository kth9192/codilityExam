
/**
 * Created by kth919 on 2017-03-26.
 */
public class PassingCars {
    public static void main(String[] args){
        int[] A = new int[]{0,0,1,1};

        System.out.println("결과 : " + solution(A));

    }

    public static int solution(int[] A){

        int result = 0;
        int zero = 0;

        for (int i = 0; i< A.length; i++){
            if (A[i] == 0 ){
                zero++;
            } else if (A[i] == 1){
                result += zero;


            }
        }
        //오버플로우
        if (result > 1000000000 || result < 0 ){
            result = -1;
        }

        return result;
    }
}
