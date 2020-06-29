package greatestcommondivisor;
import java.util.Scanner;
public class GCDCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numbers[]=new int[5];
		int arrayLength=numbers.length;
		int result=0;
		for(int i=0;i<5;i++) {
			System.out.println("Enter a number:\n");
			numbers[i]=sc.nextInt();
		}
		sc.close();
		GreatestCommonDivisor gcd=new GreatestCommonDivisor();
		result=gcd.calculateMultipleNumberGCD(numbers, arrayLength);
		System.out.printf("\nGCD of the numbers entered is: %d",result);
	}

}
