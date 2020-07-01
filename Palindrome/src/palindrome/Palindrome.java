package palindrome;

public class Palindrome {
	public boolean isPalindrome(String input){
		input=input.replaceAll(" ","");
		input=input.toLowerCase();
		int n = input.length();
	    	for( int i = 0; i <= n/2; i++ )
	        	if (input.charAt(i) != input.charAt(n-i-1))
	        		return false;
	    	return true;  
	}

}
