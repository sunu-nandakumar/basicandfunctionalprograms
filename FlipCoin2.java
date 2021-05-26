package programsforjava;

public class FlipCoin2 {
	public static void main(String[] args) {

		int head = 0;
		int tail = 0;
		int n = 10;
		for (int i = 1; i <= n; i++) {
			double coin = Math.random();
			if (coin > 0.5) {
				head++;

			} else {
				tail++;
			}

		}
		int percentHead = (head * 100) / 10;
		int percentTail = (tail * 100) / 10;

		System.out.println(" The percentage of heads is : " + percentHead);
		System.out.println(" The percentage of tails is : " + percentTail);
	}
}