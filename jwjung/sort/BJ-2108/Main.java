import java.io.*;
import java.util.StringTokenizer;

/***
 * 작성자: 정지운
 * 풀이시간: 120
 * 원문 링크: <a href="https://www.acmicpc.net/problem/2108">...</a>
 */

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tc = Integer.parseInt(br.readLine());
        int[] array = new int[tc];

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i] = Integer.parseInt(st.nextToken());
        }

        int[] resultArr = new int[4];

        countingSort(array, resultArr);

        for (int token : resultArr) {
            bw.write(String.valueOf(token));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }

    public static void countingSort(int[] arr, int[] resultArr) {

        int[] countingArray = new int[8001];
        double summary = 0;

        for (int i : arr) {
            summary += i;
            countingArray[i + 4000]++;
        }

        int idx = 0;
        int maxIdx = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int maxDupleCount = 0;

        for (int i = 0; i < countingArray.length; i++) {

            if (countingArray[i] > maxValue) {
                maxDupleCount = 0;
                maxIdx = i;
                maxValue = countingArray[i];
            } else if (countingArray[i] == maxValue) {

                maxDupleCount++;

                if (maxDupleCount <= 1) {
                    maxIdx = i;
                    maxValue = countingArray[i];
                }
            }

            for (int j = 0; j < countingArray[i]; j++) {
                arr[idx++] = i - 4000;
            }
        }

        //1. 산술평균값
        resultArr[0] = (int) Math.round(summary / arr.length);

        //2. 중앙값
        resultArr[1] = arr[arr.length / 2];

        //3. 최빈값
        resultArr[2] = maxIdx - 4000;

        //4. 범위
        resultArr[3] = arr[arr.length - 1] - arr[0];
    }

}
