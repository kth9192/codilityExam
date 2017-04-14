
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by kth919 on 2017-04-10.
 */
public class EquiLeader {

    public static void main(String[] args){

        int[] A = new int[]{4,3,4,4,4,2};

        System.out.println("결과 : " + solution(A));
    }

    // 전체 배열을 둘로 나누었을때 각각에서 과반수 이상 등장하는 값이 리더가 되고,
    // 두 부분이 같은 리더를 가질때 경우가 동등리더를 가지는 경우이다.
    // 리더는 부분 배열에서 과반수 이상이 부분배열에서 등장함을 뜻하니
    // 이는 두 부분에서 등장한 리더요소의 갯수는 전체 배열요소에서 반이상이라는 것이다.
    // 따라서 동등리더는 전체 배열의 리더인 수만 동등리더가 된다.

    public static int solution (int [] A){

        int result = 0;
        int leader = Integer.MIN_VALUE;
        HashMap<Integer, Integer> infoMap = new HashMap<Integer, Integer>();
        int leftStd = 0;
        int cnt = 0;

        for (int i = 0; i<A.length; i++){

            if (!infoMap.containsKey(A[i])) {
                infoMap.put(A[i], 1);
            } else {
                infoMap.put(A[i] , infoMap.get(A[i]) + 1 );
            }
        }

        Iterator<Integer> iterator = infoMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();

            if (cnt == 0){
                cnt = infoMap.get(key);
                leader = key;
            } else if (cnt < infoMap.get(key)){
                cnt = infoMap.get(key);
                leader = key;

            }

        }

        for (int i = 0; i<A.length; i++){

            if (A[i] == leader){
                leftStd ++;

            }
            if (leftStd > (i+1)/2 && (cnt - leftStd) > (A.length - i - 1) / 2){

                result++;
            }

        }

        if (cnt == 1){
            result = 0;
        }

        return result;
    }
}
