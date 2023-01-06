import java.util.Scanner;

/***
 * 작성자: 정지운
 * 풀이시간: 30분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/1929">...</a>
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int startRange = sc.nextInt();
        int endRange = sc.nextInt();

        int[] rangeArray = new int[endRange + 1];

        //에라토스테네스의 체
        for (int i = startRange; i <= endRange ; i++) {

            if (rangeArray[i] > 0) continue;

            if (isPrime(i)) {
                for(int j = i + i; j <= endRange; j+=i) {
                    rangeArray[j] += 1;
                }

                System.out.println(i);
            } else {
                rangeArray[i] += 1;
            }
        }
    }

    public static boolean isPrime(int argNumber) {

        //예외: 인자가 1인 경우
        if (argNumber == 1) return false;

        int sqrt = (int) Math.sqrt(argNumber);

        //N이 합성수라면 1과 루트 N사이에 반드시 약수가 존재함
        for (int i = 2; i <= sqrt; i++) {
            if (argNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
