package DSA.Sorting;

import java.util.Scanner;

public class InsertionSort_Recursive {
    static void insertionRec(int[] arr, int n) {
        if (n <= 1)
            return;
        insertionRec(arr, n - 1);
        int key = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Elements ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Insert Array Element ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionRec(arr, n);
        sc.close();
    }
}
