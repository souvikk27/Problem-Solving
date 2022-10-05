package DSA.Sorting;

public class Merge_Sort {
    static void merge(int[] arr, int beg, int mid, int end) {
        int i, j, k;
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (i = 0; i < n1; i++) {
            L[i] = arr[beg + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = arr[mid + j + 1];
        }
        i = 0;
        j = 0;
        k = beg;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 15, 5, 30, 9, 2, 25 };
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
