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

//        int[] array = {6, -8, 1, 12, 8, 3, 7, -7};
        pivotSort(array, 0, array.length);

        for (int token : array) {
            bw.write(String.valueOf(token));
            bw.newLine();
        }
        bw.flush();
        bw.close();

    }

    public static void pivotSort(int[] pArr, int st, int en) {

        if(en <= st + 1) return;

        int pivot = pArr[st];
        int l = st + 1;
        int r = en - 1;

        while (true) {
            while (l <= r && pArr[l] <= pivot) l++;
            while (l <= r && pArr[r] >= pivot) r--;
            if(l > r) break;
            swap(pArr, l, r);
        }

        swap(pArr, st, r);

        pivotSort(pArr, st, r);
        pivotSort(pArr, r+1, en);
    }

    public static void swap(int[] pArr, int idx1, int idx2) {
        int temp = pArr[idx1];
        pArr[idx1] = pArr[idx2];
        pArr[idx2] = temp;
    }


}
