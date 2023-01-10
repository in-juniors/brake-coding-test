import java.util.ArrayList;
import java.util.Scanner;

/***
 * 작성자: 정지운
 * 풀이시간: 20분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/2750">...</a>
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        int[] arr = new int[tc];

        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
        }

        //정렬 시작
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int n : arr) {
            System.out.println(n);
        }
    }
}
