package tasks;

public class tesk6 {

	public static void main(String[] args) {

		calcPrime(50);
	}

	private static void calcPrime(int n) {
		System.out.print("The prime numbers ");
		System.out.println("smaller than or equal to " + n);
		boolean[] A = new boolean[n + 1];
		if (n >= 2) {
			for (int i = 2; i <= n; i++) {
				A[i] = true;
			}
			for (int i = 0; i < Math.sqrt(n); i++) {
				if (A[i]) {
					for (int j = i * i; j <= n; j += i) {
						A[j] = false;
					}
				}
			}

			for (int i = 0; i < A.length; i++) {
				if (A[i]) {
					System.out.print(i + ",");
				}
			}

		}
	}
}
