package java_basic_programs;

import java.util.Scanner;

public class Palindrom {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a word to palindrome");
			String str = sc.next();
			String rev = new StringBuilder(str).reverse().toString();
			System.out.println(str.equals(str));
			
		}
}
