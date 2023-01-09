import java.util.HashMap;
import java.util.Scanner;

/***
 * 작성자: 정지운
 * 풀이시간: 5분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/14425">...</a>
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int subjectCount = sc.nextInt();
        int inputCount = sc.nextInt();
        int result = 0;

        HashMap<String, String> subjects = new HashMap<String, String>();

        for (int i = 0; i < subjectCount; i++) {
            String next = sc.next();
            subjects.put(next, next);
        }

        for (int j = 0; j < inputCount; j++) {
            if (subjects.containsKey(sc.next())) {
                result++;
            }
        }

        System.out.println(result);
    }
}
