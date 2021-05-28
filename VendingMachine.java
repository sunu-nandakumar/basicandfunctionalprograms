package junitPrograms;
import java.util.Scanner;
public class VendingMachine {

	public static void main(String[] args) {
		int amount;
		Scanner myObj = new Scanner(System.in);
		System.out.println(" enter the amount you want to change ");
		amount= myObj.nextInt();
		countCurrency(amount);	

	}
	public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 1000, 500, 100, 50, 10, 5, 2, 1 };
        int[] noteCounter = new int[8];
        for (int i = 0; i < 8; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
      
       
        System.out.println("Currency Count ->");
        for (int i = 0; i < 8; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
}
}
