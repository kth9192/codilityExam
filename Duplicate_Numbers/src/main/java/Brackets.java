import java.util.HashMap;
import java.util.Stack;

/**
 * Created by kth919 on 2017-04-05.
 */
public class Brackets {

    public static void main(String[] args){

        String S = "{{{}";
        System.out.println("결과 " + solution(S));
    }

    public static int solution(String S){

        int result = 0;
        HashMap<Character, Character> infoMap = new HashMap<Character, Character>();
        Stack mstack = new Stack();
        int flag = 0;

        infoMap.put('}', '{');
        infoMap.put(']', '[');
        infoMap.put(')', '(');


            //들어온 문자열을 글자별로 자름
            for (int i = 0; i<S.length(); i++) {

                if (infoMap.containsKey(S.charAt(i)) ) {

                    if (mstack.size() == 0){
                        flag = 1;
                        break;
                    }
                     else if (infoMap.get(S.charAt(i)) != mstack.pop() ){
                         flag = 1;
                         break;
                     }
                } else {
                    mstack.push(S.charAt(i));
                }
            }


            if (flag == 0){
                if (mstack.size() != 0){
                    result = 0;
                } else {
                    result = 1;

                }
            }

        return result;
    }
}
