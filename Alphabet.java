package programsforjava;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		char ch;
		Scanner obj = new Scanner(System.in);
		System.out.println("please enter the character :");
		ch = obj.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

	}

}
