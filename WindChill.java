package functionalprograms;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);
		System.out.println(" Enter temperature between 32f to 50 f");
		double temperature = myObj.nextDouble();
		
		System.out.println("enter speed of wind between 3 and 120 mph ");
		double speed = myObj.nextDouble();

		double wind = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * Math.pow(speed, 0.16);

		System.out.println("wind chill is :" + wind);
	}
}
