import java.io.*;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
        int tc = Integer.parseInt(br.readLine());

        int[] array = new int[tc];

        for (int i = 0; i < tc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i] = Integer.parseInt(st.nextToken());
        }

        countingSort(array);

        for (int token : array) {
            bw.write(String.valueOf(token));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void countingSort(int[] arr) {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] countingArray = new int[10000];

        for (int i : arr) {
            countingArray[i-1]++;
        }

        int idx=0;

        for (int i = 0; i < countingArray.length; i++) {
            for (int j = 0; j < countingArray[i]; j++) {
                arr[idx++] = i+1;
            }
        }
    }

}
