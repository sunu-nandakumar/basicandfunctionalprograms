package logicalprograms;

import java.util.Arrays;
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		Scanner myobj = new Scanner(System.in);

		int[] array = new int[5];
		System.out.println("Enter five number between 1 - 10: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = myobj.nextInt();
		}
		
		int[] secondArray = new int[5];
		int finalCount = 0 ;
		int arrCounter = 0;
		
		while(arrCounter < array.length)
		{
			System.out.println(+ arrCounter);
		finalCount++;
		int random = (int) (Math.random()*11);
		System.out.println(" the random value generated is : " + random );
		if (arrayCheck(random,array) && !arrayCheck(random,secondArray)) {
			secondArray[arrCounter] = random;
			arrCounter= arrCounter + 1 ;
		}
			
		}
		
		System.out.println("the final count to reach the coupon number is " + finalCount);
	}
	public static boolean arrayCheck (int random,int [] arrayObj)
	{
		for (int i=0 ; i< arrayObj.length; i++) {
			if(arrayObj[i] == random)
			{
				return true;
				
			}
		}
		return false;
	}
}

