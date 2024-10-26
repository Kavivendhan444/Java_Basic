package java_basic_programs;

import java.util.Scanner;

public class Reverse_a_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word to reverse");
		String str = sc.next();
		StringBuilder rev = new StringBuilder(str).reverse();
		System.out.println(rev);

	}

}
