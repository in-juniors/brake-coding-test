import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/***
 * 작성자: 정지운
 * 풀이시간: 70분
 * 원문 링크: <a href="https://www.acmicpc.net/problem/2751">...</a>
 */

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());

        int[] arr = new int[tc];

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] result = splitAndMerge(arr);

        for (int token : result) {
            bw.write(String.valueOf(token));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static int[] splitAndMerge(int[] arr) {

        int[] frontArr = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] backArr = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

        //재귀 분할이 필요한 경우
        if(frontArr.length >= 2) {
            frontArr = splitAndMerge(frontArr);
        }
        if(backArr.length >= 2){
            backArr = splitAndMerge(backArr);
        }

        return merge(frontArr, backArr);
    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int idx1 = 0;
        int idx2 = 0;

        int maxIdx1 = arr1.length - 1;
        int maxIdx2 = arr2.length - 1;

        int[] result = new int[arr1.length + arr2.length];

        while (idx1 <= maxIdx1 || idx2 <= maxIdx2) {

            int currentIdx = idx1 + idx2;

            if (idx1 > maxIdx1) {
                result[currentIdx] = arr2[idx2++];
                continue;
            } else if (idx2 > maxIdx2) {
                result[currentIdx] = arr1[idx1++];
                continue;
            }

            result[currentIdx] = arr1[idx1] < arr2[idx2] ? arr1[idx1++] : arr2[idx2++];
        }

        return result;
    }
}
