package java_basic_programs;

import java.util.Scanner;

public class Factorial_of_a_Number {
		public static void main(String[] args) {
			Scanner  sc = new Scanner(System.in);
			System.out.println("Enter n value to factorial a number");
			int n  = sc.nextInt();
			int num1  = 1;
			for(int i = 1; i<=n; i++) {
				num1 = num1*i;
			}
			System.out.println(num1);
			
			
			
//			int num = 5, factorial = 1;
//			for(int i = 1; i<=num ; i++ ) {
//				factorial *=i;                     // fact = fact * i
//			}
//			System.out.println(factorial);
		}
}
