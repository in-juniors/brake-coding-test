import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
/***
 * 작성자: 정지운
 * 풀이시간: 10분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/10814">...</a>
 */
class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        //임의의 비교연산자 생성
        //JAVA Comparator 는 동등한 값에 대해 Stable Sort 를 보장함
        Comparator<String> customComparator = (s1, s2) -> {
            int age1 = Integer.parseInt(s1.split(" ")[0]);
            int age2 = Integer.parseInt(s2.split(" ")[0]);

            return Integer.compare(age1, age2);
        };

        ArrayList<String> stringArr = new ArrayList<>();

        for (int i = 0; i < tc; i++) {
            stringArr.add(br.readLine());
        }

        stringArr.sort(customComparator);

        for (String token : stringArr) {
            bw.write(token);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }


}
