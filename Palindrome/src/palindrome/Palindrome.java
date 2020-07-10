package palindrome;

public class Palindrome {
	public boolean isPalindrome(String input){
		input=input.toLowerCase();
		input=input.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
		.replace("ú", "u").replace("ñ", "n");
		input=input.replaceAll("[^a-z0-9]","");
		int n = input.length();
	    	for (int i = 0; i <= n/2; i++)
	        	if (input.charAt(i) != input.charAt(n-i-1))
	        		return false;
	    	return true;  
	}

}
