package greatestcommondivisor;

public class GreatestCommonDivisor {
	
	 public int calculateRegularGCD(int num1, int num2) {
		 if(num2==0) {
			 return num1;
		 }
		 return calculateRegularGCD(num2, num1%num2);
	 }
	 public int calculateMultipleNumberGCD(int numbers[], int arrayLength) { 
	        int result = numbers[0]; 
	        for (int i = 1; i < arrayLength; i++) 
	            result = calculateRegularGCD(numbers[i], result); 
	        return result; 
	 } 
	
	
}
