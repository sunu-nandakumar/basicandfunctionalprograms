package logicalprograms;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		 int n, firstTerm = 0, secondTerm = 1;
		 
		 Scanner myobj = new Scanner(System.in);
	System.out.println("Enter the number of terms: ");
	n = myobj.nextInt();
	System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstTerm + ", ");

		     
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;

	}

}
}
