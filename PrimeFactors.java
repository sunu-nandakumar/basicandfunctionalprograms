package programsforjava;

import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		int number;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = obj.nextInt();

		while (number%2==0)
        {
            System.out.print(2 + " ");
            number = number / 2;
        }
 
        
        for (int i = 3; i <= Math.sqrt(number); i= i + 2)
        {
            
            while (number%i == 0)
            {
                System.out.print(i + " ");
                number = number / i;
            }
        }
		if (number > 2) {
			System.out.println(number);
		}
	}

}
