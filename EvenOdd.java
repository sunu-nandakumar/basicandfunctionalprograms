package programsforjava;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		int number;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter the number :");
		number=obj.nextInt();
		
		if ( number % 2 == 0)
		{
			System.out.println("the number is even");
		
		}
		
		else if(number == 0){
			System.out.println("the number is even");
	 
		}
		else
		{
			System.out.println("the number is odd");
		}
	}

}
