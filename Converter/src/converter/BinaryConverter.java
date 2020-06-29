package converter;

public class BinaryConverter {
	
	public String decimalToBinary(int decimalNumber) {
		String binaryNumber="";
		int remainder=0;
		while(decimalNumber>0) {
			remainder=decimalNumber%2;
			decimalNumber=decimalNumber/2;
			binaryNumber=binaryNumber+remainder;
		}
		return new StringBuilder(binaryNumber).reverse().toString();
		
	}
	
	
	

}
