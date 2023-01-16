import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/***
 * 작성자: 정지운
 * 풀이시간: 15분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/1181">...</a>
 */

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        //임의의 비교연산자 생성
        Comparator<String> customComparator = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            } else {
                //s1 과 s2를 ASCII CODE Value 비교
                return s1.compareTo(s2);
            }
        };

        ArrayList<String> stringArr = new ArrayList<>();

        for (int i = 0; i < tc; i++) {
            stringArr.add(br.readLine());
        }

        stringArr.sort(customComparator);

        //중복제거용
        String lastToken = "";
        for (String token : stringArr) {
            if (!lastToken.equals(token)) {
                bw.write(token);
                bw.newLine();
            }
            lastToken = token;
        }

        bw.flush();
        bw.close();
    }


}
