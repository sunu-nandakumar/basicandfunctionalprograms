package programsforjava;
import java.util.Scanner;
public class Harmonic {

	public static void main(String[] args) {
		
		System.out.print("Enter any number : ");
        Scanner obj= new Scanner(System.in);
        int num = obj.nextInt();
      
        double result = 0.0;
        while(num > 0)
          {
               result = result + (double) 1 / num;
               num--;
               System.out.print(result +"  ");
          }
        System.out.println("");
        System.out.println("Output of Harmonic Series is "+result);
        
	}

}
