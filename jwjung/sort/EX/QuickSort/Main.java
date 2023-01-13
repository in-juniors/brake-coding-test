import java.util.Arrays;

class Scratch {

    public static void main(String[] args) {
        
        int[] array = {6, -8, 1, 12, 8, 3, 7, -7};

        pivotSort(array);

        for (int i : array) {
            System.out.println(i);
        }

    }

    public static void pivotSort(int[] pArr) {

        if (pArr.length <= 1) return;

        int lIdx = 1;
        int rIdx = pArr.length - 1;

        while (true) {
            while (lIdx <= rIdx && pArr[lIdx] <= pArr[0]) lIdx++;
            while (lIdx <= rIdx && pArr[rIdx] > pArr[0]) rIdx--;

            if(lIdx > rIdx) break;

            swap(pArr, lIdx, rIdx);
        }

        swap(pArr, 0, rIdx);

        //피벗 기준으로 분할
        int[] lArr = Arrays.copyOfRange(pArr, 0, rIdx);
        int[] rArr = Arrays.copyOfRange(pArr, rIdx+1, pArr.length);

        pivotSort(lArr);
        pivotSort(rArr);

        for (int i = 0; i < lArr.length; i++) {
            pArr[i] = lArr[i];
        }
        for (int i = 0; i < rArr.length; i++) {
            pArr[lArr.length + 1 + i] = rArr[i];
        }
    }

    public static void swap(int[] pArr, int idx1, int idx2) {
        int temp = pArr[idx1];
        pArr[idx1] = pArr[idx2];
        pArr[idx2] = temp;
    }

    
}
