import java.util.Scanner;

/***
 * 작성자: 정지운
 * 풀이시간: 5분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/2738">...</a>
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        //첫 번째 행렬
        int[][] matrix1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        //두 번째 행렬 더한 뒤 프린트 하기
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] += sc.nextInt();
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
