package java_basic_programs;

import java.util.Scanner;

public class Vowel_Consonant_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String str = sc.next();
		int vowels = 0 , consonants = 0;
		for(char c : str.toCharArray()) {
			if("aeiouAEIOU".indexOf(c)!=-1) {
				vowels++;
			}else if(Character.isLetter(c)){
				consonants++;
			}
		}
		System.out.println("Vowels : "+ vowels +" , consonants : "+ consonants);
	}
}
