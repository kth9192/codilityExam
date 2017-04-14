import java.util.*;

/**
 * Created by kth919 on 2017-03-24.
 */
public class MissingInteger {

    public static void main(String[] args){

        int[] A = new int[]{-1};


        System.out.println("결과 : " + solution(A));
    }

    public static int solution (int [] A){

        int result = 1;
        int clear_flag = 0;
        int flag = 0;

            ArrayList<Integer> sourceList = new ArrayList<Integer>();

            for (int i = 0 ; i<A.length; i++){

                if (A[i] > 0){ // 양수만 거름
                    sourceList.add(flag, A[i]);
                    flag++;
                }
            }

            TreeSet hs = new TreeSet(sourceList);
            ArrayList<Integer> newSourceList = new ArrayList<Integer>(hs);
            for (int i = 0; i< newSourceList.size(); i++){

               if (newSourceList.get(i) != (i+1)){
                    System.out.print((i+1) + " 가 없다");
                    result = i+1;
                    clear_flag = 1;
                    break;
               }
            }

            if (clear_flag == 0 && !sourceList.isEmpty()){
                result = newSourceList.get(newSourceList.size() - 1) + 1;
            }

        return result;
    }

}

//    public int solution(int[] A) {
//        // write your code in Java SE 8
//        int result = 1;
//        HashMap<Integer, Integer> sourceMap = new HashMap<Integer, Integer>();
//        int clear_flag = 0;
//
//        Arrays.sort(A);
//
//        if (A[A.length-1] >0 ) {
//            for (int i = 1; i <= A[A.length - 1]; i++) {
//                if (!sourceMap.containsKey(i))
//                    sourceMap.put(i, 0);
//            }
//
//            for (int i = 0; i< A.length; i++){
//                if (sourceMap.containsKey(A[i]) && sourceMap.get(A[i]) == 0 ){
//                    sourceMap.put(A[i], 1);
//                }
//            }
//
//            Iterator<Integer> iterator = sourceMap.keySet().iterator();
//            while (iterator.hasNext()) {
//                int key = iterator.next();
//
//                if (sourceMap.get(key) == 0) {
//                    result = key;
//                    clear_flag = 1;
//                    break;
//                }
//            }
//            if (clear_flag == 0){
//                result = A[A.length - 1] + 1;
//            }
//        }
//
//        return result;
//    }