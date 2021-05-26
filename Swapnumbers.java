package programsforjava;

public class Swapnumbers {
	public static void main(String[] args) {
		
	
//swapping two numbers using 3 variable
	int a = 20;
	int b = 30;
	int temp;
	
	System.out.println("before swapping :" + a + " " + b );
	

	temp=a;
	a=b;
	b=temp;
	System.out.println(" after swapping :" + a + " " + b );
	//Swapping two numbers without using 3rd variable
	
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("After swapping without using Temp variable:" + a + " " + b);
	
	
	}	
}

