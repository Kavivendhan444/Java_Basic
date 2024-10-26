package java_basic_programs;

import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value to print fibonacci series");
		int n  = sc.nextInt();
		int num1 = 0 , num2 = 1;
		System.out.print("Fibonacci Series : "+num1 +","+num2);
		for (int i = 2; i<n;i++) {
			int num3 = num1+ num2;
			System.out.print(","+ num3);
			num1 = num2 ;num2 = num3;
		}
	}
}
