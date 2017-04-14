/**
 * Created by kth919 on 2017-03-26.
 */

// 두수 범위 내의 배수 구하기. 배수는 대상 수에 배수를 구할 수로 나누면 생성 A/K , B/K .
    // 범위내를 구하기 위해 이 둘을 - 연산하고 범위 끝자락인 A의 경우 -연산으로 배제되는 것을 막기 위해 배수인지 조건을 걸어 구해 배수로 판명나면 +1을 한다.
public class CountDiv {
    public static void main(String[] args){
        int A = 0;
        int B = 0;
        int K = 2;
        System.out.println("결과 : " + solution(A, B , K));
    }

    public static int solution(int A, int B, int K){
        int result = 0;

        result = B/2 - A/2;
        if (A%K == 0){
            result += 1;
        }

        return result;
    }
}
