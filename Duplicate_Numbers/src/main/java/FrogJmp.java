import java.util.Arrays;

/**
 * Created by kth919 on 2017-03-19.
 */
public class FrogJmp {
    public static void main(String[] args){

        System.out.println("필요한 점프 : "   + solution(1,2,3));
    }

    public static int solution (int X, int Y, int D){

        int result = 0;
        int source = ((Y - X) / D) ;
        int remainder = ((Y - X) % D) ;

        if (X <= Y ) {
            if (remainder == 0) {
                result = source;
            } else {
                result = (source + 1);
            }
        } else {

        }

        return result;
    }
}

