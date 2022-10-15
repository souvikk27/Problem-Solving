
class ReverseNumber {
    public static int reverse(int n) {
        int rev = 0;
        int remainder = 0;
        do {
            remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n / 10;
        } while (n > 0);
        return rev;
    }

    public static void main(String[] args) {
        int n = 587;
        int num = reverse(n);
        System.out.println(num);
    }
}