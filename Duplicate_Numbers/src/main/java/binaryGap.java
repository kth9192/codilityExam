import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kth919 on 2017-03-16.
 */
public class binaryGap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이진수 사이 최대 0을 출력할 수를 입력");
       System.out.print(solution(scanner.nextInt()));
    }

    public static int solution(int N) {

        int binaryGap = 0;
        int tmp = 0;
        int flag = 0;

        while (true){

            if (N == 1) {
                if(binaryGap <tmp) {
                    binaryGap = tmp;
                }
                break;
            }

            if (N%2 == 1 && flag == 0){
                flag =1;
                tmp = 0;
            }
            else if ( N%2 == 0 && flag == 1) {

                    tmp++;
                    System.out.println("중간로그" + tmp);

            }
             else if (N%2 == 1 && flag == 1) {

                if(binaryGap <tmp) {
                    binaryGap = tmp;
                }

               System.out.println("갭로그" + binaryGap);
               tmp = 0;
             }
             else{

            }

            N = N/2;
            System.out.println("로그" + N);


        }
            return binaryGap;
        }
    }