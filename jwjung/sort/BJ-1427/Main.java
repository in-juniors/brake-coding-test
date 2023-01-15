import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/***
 * 작성자: 정지운
 * 풀이시간: 5분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/1427">...</a>
 */

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] intArr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            intArr[i] = str.charAt(i) - 48;
        }

        Arrays.sort(intArr);

        for (int i = intArr.length -1; i >= 0; i--) {
            bw.write(String.valueOf(intArr[i]));
        }

        bw.flush();
        bw.close();
    }
}
