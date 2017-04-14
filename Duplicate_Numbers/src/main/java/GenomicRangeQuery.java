import java.util.Arrays;

/**
 * Created by kth919 on 2017-03-27.
 */
public class GenomicRangeQuery {

    public static void main(String[] args){

        String S = "CCTTT";
        int[] P = new int[]{1};
        int[] Q = new int[]{3};
        int count = 1;

        System.out.print(Arrays.toString(solution(S, P, Q)) );

    }

    public static int [] solution (String S, int [] P, int [] Q){

        int[] result = new int[P.length];

        int[] freqA = new int[S.length()+1];
        int[] freqC = new int[S.length()+1];
        int[] freqG = new int[S.length()+1];
        int[] freqT = new int[S.length()+1];

          Arrays.fill(freqA, 0);
          Arrays.fill(freqC, 0);
          Arrays.fill(freqG, 0);
          Arrays.fill(freqT, 0);


        for (int i = 0; i< S.length(); i++){
            if (S.charAt(i) == 'A'){

                freqA[i+1] = freqA[i] + 1;
                freqC[i+1] = freqC[i];
                freqG[i+1] = freqG[i];
                freqT[i+1] = freqT[i];
            }else if (S.charAt(i) == 'C'){

                freqA[i+1] = freqA[i];
                freqC[i+1] = freqC[i] +1 ;
                freqG[i+1] = freqG[i];
                freqT[i+1] = freqT[i];

            }else if (S.charAt(i) == 'G'){

                freqA[i+1] = freqA[i];
                freqC[i+1] = freqC[i];
                freqG[i+1] = freqG[i] +1 ;
                freqT[i+1] = freqT[i];

            }else {

                freqA[i+1] = freqA[i];
                freqC[i+1] = freqC[i];
                freqG[i+1] = freqG[i];
                freqT[i+1] = freqT[i] +1 ;

            }
        }

        for (int i = 0; i< P.length; i++){

            if ((freqA[Q[i]+1] - freqA[P[i]+1]) != 0 || S.charAt(P[i]) == 'A'){

                result[i] = 1;

            }else if ((freqC[Q[i]+1] - freqC[P[i]+1]) != 0 || S.charAt(P[i]) == 'C'){

                result[i] = 2;

            }else if ((freqG[Q[i]+1] - freqG[P[i]+1]) != 0 || S.charAt(P[i]) == 'G'){

                result[i] = 3;

            }else if ((freqT[Q[i]+1] - freqT[P[i]+1]) != 0 || S.charAt(P[i]) == 'T'){
                result[i] = 4;

            }else {
                if (S.charAt(P[i]) == 'A'){
                    result[i] = 1;
                }else if (S.charAt(P[i]) == 'C'){
                    result[i] = 2;
                }else if (S.charAt(P[i]) == 'G'){
                    result[i] = 3;

                }else if (S.charAt(P[i]) == 'T'){
                    result[i] = 4;

                }
            }

        }

        return result;
    }
}
//
//    int[] result = new int[P.length];
//    String tmp;
//
//    HashMap<String , Integer> sourceMap = new HashMap<String, Integer>();
//
//        sourceMap.put("A" , 1);
//                sourceMap.put("C" , 2);
//                sourceMap.put("G" , 3);
//                sourceMap.put("T" , 4);
//
//                for (int i = 0; i< P.length; i++){
//
//        tmp = S.substring(P[i] , Q[i]+1);
//
//        if (tmp.contains("A") ){
//        result[i] = sourceMap.get("A");
//
//        }else if (tmp.contains("C")){
//        result[i] = sourceMap.get("C");
//
//        }else if (tmp.contains("G")){
//        result[i] = sourceMap.get("G");
//
//        }else {
//        result[i] = sourceMap.get("T");
//        }
//
//        }
//
//        return result;