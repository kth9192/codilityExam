
/**
 * Created by kth919 on 2017-04-18.
 */
public class CountFactors {

    public static void main(String[] args){

        int N = 25 ;

        System.out.println("결과 : " + solution(N));
    }

    public static int solution (int N){

        int result = 0;

        for(int i=1; i<=Math.sqrt(N); i++){

          if(N%i==0){
              System.out.println(i + " : " + N);

              result+=2;
            }
            if (Math.pow(i, 2) == N){
                result--;
            }
        }


        return result;

    }
}

//    int result = 1;
//    HashMap<Integer, Integer> infoMap = new HashMap<Integer, Integer>();
//
//        for(int i=1; i<=N; i++){
//                if (i == -1){
//                break;
//                }
//                while(N%i==0){
////                System.out.println(i + " : " + N);
//
//                if (!infoMap.containsKey(i)){
//                infoMap.put(i, 1);
//                }else {
//                infoMap.put(i, infoMap.get(i) + 1);
//                }
//
//                N = N/i;
//                }
//
//                }
//
//                Iterator<Integer> iterator = infoMap.keySet().iterator();
//        while (iterator.hasNext()) {
//        Integer key = iterator.next();
//
//        System.out.println("key" + key);
//        result *= infoMap.get(key)+1;
//        }
//
//        return result;