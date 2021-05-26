package programsforjava;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		int year;
	      System.out.println("Enter an Year :: ");
	      Scanner obj = new Scanner(System.in);
	      year = obj.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println(+year +" year is a leap year");
	      else
	         System.out.println(+year +" year is not a leap year");

	}

}
