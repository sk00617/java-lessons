package anagram;
import java.util.Scanner;
public class AnagramTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first word/sentence");
		String firstWord=sc.nextLine();
		System.out.println("Enter the second word/sentence");
		String secondWord=sc.nextLine();
		sc.close();
		Anagram anagram=new Anagram();
		if(anagram.isAnagram(firstWord, secondWord))
			System.out.println("The words are anagrams");
		else
			System.out.print("The words are not anagrams");

	}

}
