package logicalprograms;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		int number , reverse = 0; 
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter  the number you want to reverse");
		number = myobj.nextInt();
		
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
	


}

