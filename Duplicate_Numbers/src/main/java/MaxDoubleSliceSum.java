

/**
 * Created by kth919 on 2017-04-12.
 */
public class MaxDoubleSliceSum {

    public static void main(String[] args){

        int[] A = new int[]{3,2,6,-1,4,5,-1,2};

        System.out.println("결과 : " + solution(A));
    }

    // 배열의 요소는 음수를 포함하는 범위이지만 최저로 출력할수 있는 값은 사실상 0이다. (세값이 연속된 슬라이스기준일 경우가 있으므로)
    // 더한 결과물이 음수인 경우 이전보다 크든 작든 0이상의 결과물을 내기에는 전혀 도움이 안되는 값이기 때문에 0보다 작다면
    // 이전값은 더해주느니만 못하다. 따라서 그냥 0으로 친다.

    public static int solution (int [] A) {

        int result = 0;
        int[] Pre = new int[A.length];
        int[] Post = new int[A.length];

        for (int i = 0; i<A.length-1; i++){

            if (i == 0) {
                Pre[i] = 0;
            }else {
                Pre[i] = Math.max(0, Pre[i - 1] + A[i]);
            }

        }


        for (int i = A.length -1; i>0; i--){

            if (i == A.length - 1) {
                Post[i] = 0;
            }else {
                Post[i] = Math.max(0 , Post[i+1] + A[i]);
            }
        }

        for (int i = 1; i<A.length-1; i++){

            result = Math.max(result , Post[i+1] + Pre[i-1]);

        }

        return result;
    }
}
