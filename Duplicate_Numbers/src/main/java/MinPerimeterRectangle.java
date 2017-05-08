/**
 * Created by kth919 on 2017-04-19.
 */
public class MinPerimeterRectangle {

    public static void main(String[] args){

        int N = 24;

        System.out.println("결과 : " + solution(N));
    }

    public static int solution(int N){
        int result = 0;
        int tmp = 0;

        for (int i = 1; i<=Math.sqrt(N); i++){

            if (N%i == 0){

                System.out.println(i);

                tmp = (N/i)+i;
                if (i == 1){
                    result = tmp*2;
                } else if (result > tmp){
                    result = tmp*2;
                }
            }
        }

        return result;
    }
}
