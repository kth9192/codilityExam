import java.util.HashMap;

/**
 * Created by kth919 on 2017-03-23.
 */
public class FrogRiverOne {

    public static void main(String[] args){

        int[] A = new int[]{1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(5, A));
    }

    public static int solution (int X, int [] A){

        int result = -1;
        HashMap<Integer, Integer> flagMap = new HashMap<Integer, Integer>();
        int standard = 1;
        int material = 1;

        for (int i = 1; i<=X; i++ ){
            standard += i;
        }
        System.out.println("팩토리얼 : " + standard);

        for (int i = 1; i<= X; i++){
            flagMap.put(i, 0);
        }

        // 1~x 까지의 모든 좌표의 수가 등장하는 시점.

        for (int i = 0; i<A.length; i++){

            if (flagMap.containsKey(A[i]) && (flagMap.get(A[i]) == 0) ){
                flagMap.put(A[i], 1);
                material += A[i];

                System.out.println("로그확인 : " + material +  ". i는 " + i);

                if (material == standard){
                    result = i;
                    break;
                }
            }
        }


        return result;
    }
}
