package junitPrograms;
import java.util.Scanner;
public class TemperatureConversion {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("what do you want to convert to 1)Celsius or 2)Fahrenheit:");
		int convert = myObj.nextInt();
		
		if (convert == 1) {
			System.out.println("Enter the temperature in Fahrenheit:");
			int fahrenheit = myObj.nextInt();
			int celsius = (fahrenheit - 32 ) * 5 / 9;
			System.out.println("The temperature in Celsius is :" + celsius);
		}
		else {
			System.out.println("Enter the temperature in Celsius:");
			int celsius = myObj.nextInt();
			int fahrenheit = ( celsius * 9 / 5 ) + 32 ;
			System.out.println("The temperature in Celsius is :" + fahrenheit);
		}
	}
}
