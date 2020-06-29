package palindrome;
import java.util.Scanner;

public class PalindromeValidator {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String input;
		boolean result;
		System.out.println("Enter a string: ");
		input=sc.nextLine();
		sc.close();
		Palindrome palindrome=new Palindrome();
		result=palindrome.isPalindrome(input);
		System.out.println(result);
		
	}

}
