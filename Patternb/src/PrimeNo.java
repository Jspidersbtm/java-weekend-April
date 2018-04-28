public class PrimeNo {
	static boolean isPrime(int n) {
		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			return false;
		} else
			return true;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			boolean prime = isPrime(i);
			if (prime == true) {
				System.out.println(i + " is a prime no");
			} else
				System.out.println(i + " is not a prime no");
		}
	}
}
