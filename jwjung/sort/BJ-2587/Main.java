import java.util.ArrayList;
import java.util.Scanner;

/***
 * 작성자: 정지운
 * 풀이시간: 3분 - 다른 정렬문제 응용
 * 원문 링크: <a href="https://www.acmicpc.net/problem/2587">...</a>
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
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

        int average = 0;

        for (int n : arr) {
            average += n;
        }

        average = average / 5;
        System.out.println(average);
        System.out.println(arr[2]);
    }
}
