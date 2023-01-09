import java.util.Scanner;

/***
 * 작성자: 정지운
 * 풀이시간: 10분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/2566">...</a>
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[9][9];
        int maxNumber = 0;
        int resultRow = 0;
        int resultCol = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                int inputNumber = sc.nextInt();

                if (inputNumber >= maxNumber) {
                    maxNumber = inputNumber;
                    //index 기준이므로 + 1 해야합니다.
                    resultRow = i + 1;
                    resultCol = j + 1;
                }
            }
        }

        System.out.println(maxNumber);
        System.out.printf("%d %d ", resultRow, resultCol);
    }
}
