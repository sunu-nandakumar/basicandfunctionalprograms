package programsforjava;

import java.util.Scanner;

public class QuotientReminder {

	public static void main(String[] args) {
		int diviend;
		int divisor;

		Scanner obj = new Scanner(System.in);

		System.out.println("Enter the dividend :");
		diviend = obj.nextInt();
		System.out.println("Enter the divisor :");
		divisor = obj.nextInt();
		int quo = diviend / divisor;
		int reminder = diviend % divisor;
		System.out.println(quo + " ");
		System.out.println(reminder + " ");
	}
	

}
