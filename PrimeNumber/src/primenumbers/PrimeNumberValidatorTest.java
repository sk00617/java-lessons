package primenumbers;
import java.util.Scanner;
public class PrimeNumberValidatorTest {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int number=0;
		boolean result;
		do {
			System.out.println("Enter a number greater than 0: \n");
			number=sc.nextInt();
		}while(number<=0);
		sc.close();
		PrimeNumberValidator validator=new PrimeNumberValidator();
		result=validator.isNumberPrime(number);
		if(result)
			System.out.printf("\n%d is prime\n", number);
		else
			System.out.printf("\n%d is not prime\n", number);
		
		
	}

}
