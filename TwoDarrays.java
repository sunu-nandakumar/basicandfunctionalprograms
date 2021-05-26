package functionalprograms;

import java.util.Scanner;

public class TwoDarrays {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the value of m and n");

		int m = myObj.nextInt();
		int n = myObj.nextInt();
		int[][] a = new int[m][n];
		m = a.length;
		n = a[0].length;
		System.out.println(m + " " + n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%9d ", a[i][j]);
			}
			System.out.println();

		}
	}

}
