import java.util.ArrayList;

/**
 * Created by kth919 on 2017-04-25.
 */
public class Flags {

    public static void main(String[] args){

        int[] A = new int[]{5};

        System.out.println("결과 : " + solution(A));
    }

    public static int solution(int[] A){
        int result = 0;
        ArrayList<Integer> tmpList = new ArrayList<Integer>();


        if (A.length > 1) {
            for (int i = 1; i < A.length - 1; i++) {
                if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                    tmpList.add(i);
                }
            }
        }

        for (int k = 1; k<=tmpList.size(); k++){

            int standard = tmpList.get(0);
            int tmpAns = 1;

            if(tmpList.size() == 1){
                result = 1;
            }else {

                for (int i = 1; i < tmpList.size(); i++) {

                    if (k <= Math.abs(standard - tmpList.get(i))) {
                        System.out.println(k + " : " + tmpList.get(i) + " : " + Math.abs(standard - tmpList.get(i)));
                        tmpAns++;
                        standard = tmpList.get(i);
                    }

                    if (tmpAns == k) {
                        result = tmpAns;
                        break;
                    }

                }
            }

        }

        return result;
    }
}
