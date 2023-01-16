import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
/***
 * 작성자: 정지운
 * 풀이시간: 30분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/11650">...</a>
 */
class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        long[] resultArr = new long[tc];

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            resultArr[i] = (y + 100000) * 1000000 + (x + 100000);
        }

        Arrays.sort(resultArr);

        for (long token : resultArr) {

            long y = token / 1000000 - 100000;
            long x = token % 1000000 - 100000;

            bw.write(String.valueOf(x + " " + y));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }


}
