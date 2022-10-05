package DSA.Array;

public class Peak_Array_Element {
    public int peakElement(int[] arr, int n) {
        // divide & conquer approach for log(n) time complexity
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                    return mid;
                else if (arr[mid - 1] > arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else if (mid == 0)
                return arr[0] > arr[1] ? 0 : 1;
            else if (mid == n - 1)
                return arr[n - 1] > arr[n - 2] ? n - 1 : n - 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 3;
        int[] arr = { 1, 2, 3 };
        Peak_Array_Element x = new Peak_Array_Element();
        int peak = x.peakElement(arr, n);
        System.out.println(peak);
    }
}
