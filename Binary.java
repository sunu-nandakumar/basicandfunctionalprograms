package junitPrograms;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number you want to convert to binary");
		int n = myObj.nextInt();
		
		toBinary(n);
		System.out.println(); 
		
		

	}
	static void toBinary(int n)
	  {
		
        if (n > 1) {
            toBinary(n / 2);
        }
       
        System.out.print(n % 2);
	  }
	 
}
