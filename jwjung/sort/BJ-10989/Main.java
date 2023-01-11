import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/***
 * 작성자: 정지운
 * 풀이시간: 15분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/10989">...</a>
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        int[] intArr = new int[tc];

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            intArr[i] = Integer.parseInt(st.nextToken());
        }

        //정렬
        Arrays.sort(intArr);

        //출력
        for (int token : intArr) {
            bw.write(String.valueOf(token));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
