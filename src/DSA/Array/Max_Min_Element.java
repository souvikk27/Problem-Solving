package DSA.Array;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class Max_Min_Element {
    static pair getMinMax(long[] arr, long n) {
        long min = arr[0];
        long max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        pair minmax = new pair(min, max);
        return minmax;
    }

}
