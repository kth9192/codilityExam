import java.util.Stack;

/**
 * Created by kth919 on 2017-04-09.
 */
public class Nesting {

    public static void main(String[] args){
        String S = "((((";

        System.out.println("결과 : " + solution(S));
    }

    public static int solution(String S){
        int result = 1;

        Stack<Character> mStack = new Stack<Character>();

        if ( S.length() % 2 == 1){
            result = 0;
        }
        for (int i = 0; i<S.length(); i++) {

                if (S.charAt(i) == ')'){
                    if (mStack.empty() || mStack.pop() != '('){
                        result = 0;
                        break;
                    }
                } else {
                    mStack.push(S.charAt(i));
                }
        }

        if (!mStack.empty()){
            result = 0;
        }

        return result;
    }
}
