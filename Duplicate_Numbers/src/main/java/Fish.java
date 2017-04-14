import java.util.*;

/**
 * Created by kth919 on 2017-04-06.
 */
public class Fish {
    public static void main(String[] args) {

        int[] A = new int[]{4, 3, 2, 1, 5};
        int[] B = new int[]{0, 1, 0, 0, 0};

        System.out.println("결과 : " + solution(A, B));

    }

    public static int solution(int[] A, int[] B) {

        int result = 0;
        Stack<Integer> aStack = new Stack();
        HashMap<Integer, Integer> infoMap = new HashMap<Integer, Integer>();
        int flag = 0;

        for (int i = 0; i<B.length; i++){
            infoMap.put(A[i] , B[i]);
        }

        for (int i = 0; i<A.length; i++) {

            if (aStack.empty()) {
                aStack.push(A[i]);
            } else {

                while (!aStack.empty() && B[i] == 0 && infoMap.get(aStack.peek()) == 1 && aStack.peek() < A[i]) {
                    aStack.pop();
                }

                if (!aStack.empty()){
                    if (!(B[i] == 0 && infoMap.get(aStack.peek()) == 1))
                        aStack.push(A[i]);

                }else {
                    aStack.push(A[i]);
                }

            }
        }

        result = aStack.size();

        return result;
    }
}
//
//    int result = 0;
//    Stack aStack = new Stack();
//    Stack bStack = new Stack();
//
//    HashMap<Integer, Integer> infoMap = new HashMap<Integer, Integer>();
//    List<Integer> tmpA;
//    int tmpA_size = 0;
//
//    int flag = 0;
//    int tmp = 0;
//
//        for (int i = 0; i < B.length; i++) {
//        infoMap.put(A[i], B[i]);
//        }
//
//        for (int i = 0; i < A.length; i++) {
//
//        if (aStack.size() == 0) {
//
//        aStack.push(A[i]);
//        if (B[i] == 1) {
//        flag = 1;
//        }
//
//        } else if (B[i] == 1) {
//
//        flag = 1;
//        aStack.push(A[i]);
//
//        } else if (flag == 1) {
//
//        tmp = (Integer) aStack.pop();
//
//        if (tmp > A[i]) {
//        aStack.push(tmp);
//        } else {
//        aStack.push(A[i]);
//        flag = 0;
//        }
//
//        } else {
//        aStack.push(A[i]);
//        }
//
//        }
//
//        tmpA = new ArrayList<Integer>();
//        tmpA_size = aStack.size();
//        flag = 0;
//
//        for (int i = 0; i < tmpA_size; i++) {
//
//        tmpA.add((Integer) aStack.pop());
//        System.out.println("z" + tmpA.get(i));
//        }
//
//        for (int i = 0; i < tmpA.size(); i++) {
//
//        if (bStack.size() == 0) {
//        bStack.push(tmpA.get(i));
//        if (infoMap.get(tmpA.get(i)) == 0) {
//        flag = 1;
//        }
//
//        } else if (infoMap.get(tmpA.get(i)) == 0) {
//
//        flag = 1;
//        bStack.push(tmpA.get(i));
//
//        } else if (flag == 1) {
//
//        tmp = (Integer) bStack.pop();
//
//        if (tmp > tmpA.get(i)) {
//        bStack.push(tmp);
//        } else {
//        bStack.push(tmpA.get(i));
//        flag = 0;
//        }
//
//        } else {
//        bStack.push(tmpA.get(i));
//        }
//        }
//
//        for (int i = 0; i < bStack.size(); i++) {
//
//        result += 1;
//        }
