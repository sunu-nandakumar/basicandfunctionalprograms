package junitPrograms;
import java.util.Scanner;
public class DaysOfWeek {

	public static void main(String[] args) {
		int day , month , year ;
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter a date month and year");
		day = myObj.nextInt();
		month =myObj.nextInt();
		year = myObj.nextInt();
		
		int y = year - (14 - month ) / 12 ;
		int x = y + (y/4) - (y/100) + (y/400);
		int m = month + 12 * ((14 - month)/12) - 2;
		int d = (day + x + (31* m )/12 ) % 7;
		
		String arr [] =  { "Sunday " ,"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday" };
		System.out.println( arr[d]);
		
	}

}
