
class Fibonacci {
    public static int fib(int n) {
        if (n == 0)
            return n;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        int fb = fib(n);
        System.out.print(fb);
    }
}