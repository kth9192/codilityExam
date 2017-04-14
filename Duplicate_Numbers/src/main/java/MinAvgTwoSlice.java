
/**
 * Created by kth919 on 2017-03-28.
 */
public class MinAvgTwoSlice {

    //슬라이스가 두개 이상 있을때 결과를 낼수 있다는 조건과 0<= P < Q < N 인 조건에 따라
    //슬라이스의 최소 단위는 2, 3 이다.
    //예로 4이상 일때를 보자면 2 단위 일때 최소평균 보다 최소평균이 더 크게 잡히는 경우가 생긴다는 것
    //같지 않은 2개의 수 P, Q 중 1개는 평균값보다 작을 수 밖에 없다.

    public static void main(String[] args){
        int[] A = new int[]{4, 2, 2, 5, 1, 5, 8};

        System.out.println("결과" + solution(A));
    }

    public static int solution (int [] A){

        int result = 0;
        double tmp2 = 0;
        double tmp3 = 0;
        double answerFrom2 = 0;
        double answerFrom3 = 0;
        double answerTmp = 0;

        for (int i = 0; i<A.length; i++){

            if (i< A.length-1){
                if (i == 0) {
                    tmp2 = (A[i] + A[i + 1]) / (double) 2;
                    answerFrom2 = tmp2;
                    answerTmp = answerFrom2;

                } else if (tmp2 > (A[i] + A[i + 1]) / (double) 2) {
                    tmp2 = (A[i] + A[i + 1]) / (double) 2;

                }
                if (answerFrom2 > tmp2){
                    answerFrom2 = tmp2;
                }

            }
             if (i< A.length - 2){
                if (i == 0) {
                    tmp3 = (A[i] + A[i + 1] + A[i + 2]) / (double) 3;
                    answerFrom3 = tmp3;

                }else if (tmp3 > (A[i] + A[i + 1] + A[i + 2]) / (double) 3){
                    tmp3 = (A[i] + A[i + 1] + A[i + 2]) / (double) 3;

                }

                 if (answerFrom3 > tmp3){
                     answerFrom3 = tmp3;
                 }
            }

            if (answerTmp > answerFrom2){
                 answerTmp = answerFrom2;
                 result = i;
            } else if (answerTmp > answerFrom3){
                answerTmp = answerFrom3;
                result = i;
            }

        }

        return result;
    }
}

//    int result = 0;
//    double tmp = 0;
//    double tmp2 = 0;
//    double tmp3 = 0;
//    int answerFrom2 = 0;
//    int answerFrom3 = 0;
//
// if (A.length %2 == 0) {
//         for (int i = 0; i < A.length - 1; i++) {
//
//        if (i == 0) {
//        tmp2 = ((A[i] + A[i + 1]) / (double) 2);
//        answerFrom2 = i;
//
//        } else {
//        if (tmp2 > ((A[i] + A[i + 1]) / (double) 2)) {
//
//        tmp2 = ((A[i] + A[i + 1]) / (double) 2);
//        answerFrom2 = i;
//        System.out.println("2일때" + answerFrom2);
//        }
//        }
//        }
//        result = answerFrom2;
//        }
//
//        if (A.length %2 == 1) {
//        for (int i = 0; i < A.length - 2; i+=3) {
//
//        if (i == 0) {
//        tmp3 = ((A[i] + A[i + 1] + A[i + 2]) / (double) 3);
//        answerFrom3 = i;
//
//        System.out.println("tmp3" + tmp3);
//        System.out.println("3일때" + answerFrom3);
//
//        } else {
//
//        if (tmp3 > (A[i] + A[i + 1] + A[i + 2] / (double) 3)) {
//
//        tmp3 = (A[i] + A[i + 1] + A[i + 2] / (double) 3);
//        answerFrom3 = i;
//
//        System.out.println("tmp3" + tmp3);
//        System.out.println("3일때 변경" + answerFrom3);
//        }
//        }
//        }
//
//        for (int i = 0; i < A.length - 1; i++){
//        if (i == 0) {
//        tmp2 = ((A[i] + A[i + 1]) / (double) 2);
//        answerFrom2 = i;
//
//        System.out.println("tmp2" + tmp2);
//        System.out.println("2일때" + answerFrom2);
//
//        } else {
//        if (tmp2 > ((A[i] + A[i + 1]) / (double) 2)) {
//
//        tmp2 = ((A[i] + A[i + 1]) / (double) 2);
//        answerFrom2 = i;
//        System.out.println("tmp2" + tmp2);
//        System.out.println("2일때 변경" + answerFrom2);
//        }
//        }
//        }
//
//        if (tmp2> tmp3){
//        result = answerFrom3;
//        } else {
//        result = answerFrom2;
//        }
//        }
//
//        return result;
