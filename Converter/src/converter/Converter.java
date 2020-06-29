package converter;
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int decimalNumber = 0;
		String result="";
		do {
			System.out.println("Enter a number greater than zero: \n");
			decimalNumber = sc.nextInt();
		}while(decimalNumber<=0);
		BinaryConverter bc = new BinaryConverter();
		result=bc.decimalToBinary(decimalNumber);
		sc.close();
		System.out.printf("\nDecimal: %d \nBinary: %s",decimalNumber,result);

	}

}
