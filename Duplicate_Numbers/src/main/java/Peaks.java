
import java.util.ArrayList;

/**
 * Created by kth919 on 2017-04-20.
 */
public class Peaks {

    public static void main(String[] args){

        int[] A = new int[]{1,3, 2, 1};

        System.out.println("결과 : " + solution(A));
    }

    public static int solution (int [] A){

        int result = 0;
        ArrayList<Integer> tmpList = new ArrayList<Integer>();

        for (int i = 1; i<A.length-1; i++){

            if(A[i-1] < A[i] && A[i] > A[i+1]){
                tmpList.add(i);
            }

        }


        for(int i=1; i<=A.length; i++){
            int flag = 0;

            if(A.length % i == 0 ){  // 구역이 정확하게 안나눠지면 생략함.

                int bind = A.length / i;
                int added = 1;

                if (i <= tmpList.size()) {

                    for (int tmp : tmpList) {

                        if ( tmp/bind > added) {
                            flag = 0;
                            break;
                        } else {

                            flag = 1;
                            if (tmp/bind == added)
                            added++;
                        }
                    }

                    if (flag == 1) {
                        result = i;
                    } else {
                        if (added-1 != bind) {
                            flag = 0;
                        }
                    }

                }
            }
        }

        return result;
    }
}



//
//    int result = 0;
//    HashMap<Integer, Integer> tmpList = new HashMap<Integer, Integer>();
//
//
//        for (int i = 1; i<A.length-1; i++){
//
//        if(A[i-1] < A[i] && A[i] > A[i+1]){
//        tmpList.put(i, A[i]);
//        }
//
//        }
//
//        int added = 1;
//        int flag = 0;
//
//        for(int i=1; i<=Math.sqrt(A.length); i++){
//
//        if(A.length%i == 0){
//        System.out.println(i);
//
//        Iterator<Integer> iterator = tmpList.keySet().iterator();
//        while (iterator.hasNext()) {
//        Integer key = iterator.next();
//
//        if ( (added*A.length/i) >= tmpList.get(key) ){
//        added++;
//        flag = 1;
//        } else {
//        flag = 0;
//        break;
//        }
//
//        }
//
//        if (flag == 0){
//        break;
//        } else {
//        result = i;
//        }
//
//        }
//
//        }
//
//        return result;