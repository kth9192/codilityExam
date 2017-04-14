import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by kth919 on 2017-03-23.
 */
public class binaryTree {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] A;
        int count;

        System.out.println("입력갯수 입력");
        A = new int[scanner.nextInt()];

        for (int i = 0; i<A.length; i++){
            System.out.println( (i+1) + "번째 숫자 ");
            A[i] = scanner.nextInt();
        }

        SetTree(A);

    }

    public static void SetTree(int[] A){

        if (A.length == 1){
            System.out.println("종료. 리프 : " + A[0]);
            return;
        }

        int[] preA;
        int[] postA;
        int j = 0;

        int root = A.length/2;
        System.out.println("루트" + A[root]);

        preA = new int[root];
        postA = new int[A.length - (root + 1)];

        //길이가 1이거나 2일경우 예외처리
            for (int i = 0; i < root; i++) {
                preA[i] = A[i];
            }
            SetTree(preA);

            if (postA.length != 0) {
                for (int i = root + 1; i < A.length; i++) {
                    postA[j] = A[i];
                    j++;
                }
                SetTree(postA);
            }

    }
}
