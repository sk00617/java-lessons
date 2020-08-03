package anagram;
import java.util.Arrays;
public class Anagram {
	
	public String cleanString(String word){
		String newString=word;
		newString=newString.toLowerCase();
		newString=newString.replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o")
				.replace("ú", "u").replace("ñ", "n");
		newString=newString.replaceAll("[^a-z0-9]","");
		return newString;
	}
	
	public boolean isAnagram(String firstWord, String secondWord) {
		firstWord=cleanString(firstWord);
		secondWord=cleanString(secondWord);
		if (firstWord.length() != secondWord.length())
			return false;
		else {
			System.out.print(firstWord);
			System.out.print(secondWord);
			char[] word1=firstWord.toCharArray();
			Arrays.sort(word1);
			char[] word2=secondWord.toCharArray();
			Arrays.sort(word2);
			return Arrays.equals(word1,word2);
		}
	}

}
