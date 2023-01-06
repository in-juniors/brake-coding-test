import java.util.Scanner;

/***
 * 작성자: 정지운
 * 풀이시간: 10분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/11653">...</a>
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int targetNumber = sc.nextInt();
        int divider = 2;

        while (targetNumber > 1) {
            if (targetNumber % divider == 0) {
                targetNumber = targetNumber / divider;
                System.out.println(divider);
            } else {
                divider += 1;
            }
        }
    }
}
