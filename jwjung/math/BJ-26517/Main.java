import java.util.Scanner;

public class Main {
    /***
     * 작성자: 정지운
     * 풀이시간: 20분
     * 원문 링크: <a href="https://www.acmicpc.net/problem/26517">...</a>
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long k = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        //ax + b (x <= k)
        //cx + d (x > k)

        long leftSide = a * k + b;
        long rightSide = c * k + d;

        if (leftSide == rightSide) {
            System.out.printf("%s %d\n", "Yes", leftSide);
        } else {
            System.out.println("No");
        }
    }
}
