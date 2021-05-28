package junitPrograms;

import java.util.Scanner;

public class Sqrt {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println(" Enter numbers ");
		double n = myObj.nextDouble();
		double l = myObj.nextDouble();

		System.out.println(squareRoot(n, l));

	}

	static double squareRoot(double n, double l) 
    { 
        
        double x = n; 
      
        
        double root; 
      
        
        int count = 0; 
      
        while (true)
        { 
            count++;
      
            
            root = 0.5 * (x + (n / x)); 
      
            
            if (Math.abs(root - x) < l) 
                break; 
      
            
            x = root; 
        } 
      
        return root; 
    }

}
