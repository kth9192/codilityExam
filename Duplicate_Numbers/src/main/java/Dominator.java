/**
 * Created by kth919 on 2017-04-11.
 */
public class Dominator {

    public static void main(String[] args){

        int[] A = new int[]{2, 1, 1, 3, 4};

        System.out.println(solution(A));
    }
    // 전체 배열중 절반이상이 같은 경우인 수가 dominator로 인정

    public static int solution(int[] A){

        int result = -1;
        int dominator = 0;
        int cnt = 0;
        int flag = 0;

        for (int i =0; i<A.length; i++){

            if (i == 0){
                dominator = A[i];
                cnt = 1;
            } else if (dominator == A[i]){
                cnt++;
            } else {
                if (cnt == 0){
                    dominator = A[i];
                    cnt ++;
                }else {
                    cnt--;
                }

            }

        }

        for (int i = 0; i<A.length; i++){
            if (dominator == A[i]){
                flag ++;
                result = i;
            }
        }

        if (cnt == 0 || flag <= A.length/2){
            result = -1;
        }

        return result;

    }
}
