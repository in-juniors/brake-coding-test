import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/***
 * 작성자: 정지운
 * 풀이시간: 5분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/25501">...</a>
 */

public class Main {

    static int isRecursionCount = 0;

    public static int recursion(String s, int l, int r){
        isRecursionCount++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        isRecursionCount = 0;
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            System.out.printf("%d %d\n", isPalindrome(br.readLine()), isRecursionCount);
        }
    }

}
