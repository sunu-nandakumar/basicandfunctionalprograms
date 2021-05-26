package functionalprograms;
import java.util.Scanner;
public class Quadratic {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println( " Enter a , b , c: ");

		double a = myObj.nextDouble();
		double b = myObj.nextDouble();
		double c = myObj.nextDouble();
		
		double delta =Math.abs(((b*b)-(4 * a * c )));
		double d = (2*a);
		double sqDelta = Math.sqrt(delta);
		double sq = (-b + sqDelta );
		double neSq = (-b - sqDelta);
		
		double root1 = sq / d;
		double root2 = neSq / d;
		
		System.out.println(root1 + " " + root2);
		
	}

}
