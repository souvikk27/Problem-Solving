
class PrimeNumber {
	public static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 3;
		if (isPrime(n))
			System.out.println("prime number");
		else
			System.out.println("not prime number");
	}
}