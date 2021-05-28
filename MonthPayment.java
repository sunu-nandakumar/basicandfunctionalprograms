package junitPrograms;

import java.util.Scanner;

public class MonthPayment {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println(" please enter the principal amount , rate and years");
		double P = myObj.nextDouble();
		double R = myObj.nextDouble();
		double Y = myObj.nextDouble();
		
		double n = 12 * Y;
		double r = R / ( 12 * 100 );
		
		double payment = (P * r )/ (1 - (Math.pow((1+r), (-n)) )); 
		System.out.println(" the payment per month is : " + payment);

	}

}
