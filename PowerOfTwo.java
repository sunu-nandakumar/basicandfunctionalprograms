package programsforjava;
import java.util.Scanner;
public class PowerOfTwo {

	public static void main(String[] args) {
		int num;
		System.out.println("please the number :" );
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		
		int i=0;
		int powerTwo;
		while (i<=num) {
			
			
			powerTwo = (int)Math.pow(2, i);
			System.out.println(+ i +" " + powerTwo);
			i++;
		
		

	}

}
}