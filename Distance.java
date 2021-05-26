package functionalprograms;
import java.util.Scanner;
public class Distance {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println( " Enter x , y : ");

		double x = myObj.nextDouble();
		double y = myObj.nextDouble();
		
		double length = Math.sqrt(Math.pow(x , 2 ) + Math.pow(y , 2));
		System.out.println("the length from (0,0) is : " + length);
	}

}
