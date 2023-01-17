import java.io.*;
import java.util.*;

/***
 * 작성자: 정지운
 * 풀이시간: 15분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/18870">...</a>
 */

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        long[] array = new long[tc];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < tc; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        //중복 제거
        HashSet<Long> copySet = new HashSet<>();
        for (long l : array) {
            copySet.add(l);
        }

        //정렬하여 배열로 변환
        Long[] sortedArray = copySet.stream().sorted().toArray(Long[]::new);

        //맵으로 전환
        HashMap<Long, Integer> resultMap = new HashMap<>();

        for (int i = 0; i < sortedArray.length; i++) {
            resultMap.put(sortedArray[i], i);
        }

        for (long l : array) {
            bw.write(String.valueOf(resultMap.get(l) + " "));
        }

        bw.flush();
        bw.close();
    }


}
