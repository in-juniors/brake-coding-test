import java.util.Scanner;

/***
 * 작성자: 정지운
 * 풀이시간: 15분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/2563">...</a>
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testCase = sc.nextInt();
        int result = 0;

        int[][] matrix = new int[100][100];

        for (int tc = 0; tc < testCase; tc++) {

            int inputRow = sc.nextInt() - 1;
            int inputCol = sc.nextInt() - 1;

            for (int i = inputRow; i < inputRow + 10; i++) {
                for (int j = inputCol; j < inputCol + 10; j++) {
                    matrix[i][j]++;
                }
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (matrix[i][j] > 0) result++;
            }
        }

        System.out.println(result);
    }
}
