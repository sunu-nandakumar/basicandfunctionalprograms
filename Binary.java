package junitPrograms;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter number you want to convert to binary");
		int n = myObj.nextInt();
		
		int number = toBinary(n);
		System.out.println(+ number ); 
		int x = swapNibbles(n);
		System.out.println( + x);
		

	}
	public static int toBinary(int n)
	  {
		
        if (n > 1) {
            toBinary(n / 2);
        }
        int number = n % 2;
        
        System.out.print(number);
        return number ;
	  }
	static int swapNibbles(int x)
	{
	    
	  int value = ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	  
	   return value;
	}
}