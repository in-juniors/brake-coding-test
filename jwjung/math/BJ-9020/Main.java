import java.util.Scanner;

public class Main {
    /***
     * 작성자: 정지운
     * 풀이시간: 15분
     * 원문 링크: <a href="https://www.acmicpc.net/problem/9020">...</a>
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int caseSize = sc.nextInt();

        for (int i = 0; i < caseSize; i++) {

            //추측 대상
            int number = sc.nextInt();

            for (int j = number / 2; j >= 2; j--) {
                if (isPrime(j) && isPrime(number - j)) {
                    System.out.printf("%d %d\n", j, number - j);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int argNumber) {
        //예외: 인자가 1인 경우
        if (argNumber == 1) return false;

        //N이 합성수라면 1과 루트 N 사이에 반드시 약수가 존재함
        for (int i = 2; i * i <= argNumber; i++) {
            if (argNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
