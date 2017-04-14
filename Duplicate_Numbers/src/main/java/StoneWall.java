import java.util.Stack;

/**
 * Created by kth919 on 2017-04-09.
 */
public class StoneWall {

    public static void main(String[] args){
        int[] H = new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8};

        System.out.println("결과 : " + solution(H));
    }

    public static int solution(int[] H){

        int result = 0;

        Stack<Integer> mStack = new Stack<Integer>();

        for (int i = 0; i<H.length; i++){

            if (mStack.empty()){
                result++;
                mStack.push(H[i]);
            } else {

                 if (mStack.peek() > H[i]){

                     while (!mStack.empty() && mStack.peek() > H[i]){
                         mStack.pop();
                     }
                     i--;
                 }else if (mStack.peek() < H[i]){
                     result ++;
                     mStack.push(H[i]);
                 }

            }
        }


        return result;
    }
}
//
// for (int i = 0 ; i<H.length; i++) {
//
//        if (tmp == 0){
//        tmp = H[i];
//        mStack.push(H[i]);
//        } else if (tmp > H[i]) {
//        tmp = H[i];
//        tmpMap.clear();
//        tmpMap.put(H[i], 1);
//        mStack.push(H[i]);
//        }else if (H[i] > tmp){
//        if (!tmpMap.containsKey(H[i])) {
//        tmpMap.put(H[i], 1);
//        mStack.push(H[i]);
//        } else {
//        if (mStack.peek() < H[i]){
//        mStack.push(H[i]);
//        }
//        }
//        }
//
//        }
//
//
//        for (int i =0; i<mStack.size(); i++){
//        result += 1;
//        }