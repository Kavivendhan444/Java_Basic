package java_basic_programs;

import java.util.Scanner;

public class Primenumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		//Method - 1
//		int num = 15;
//		String isPrime = "The given number is a prime number";
//		for(int  i = 2; i<=Math.sqrt(i); i++){
//			if(num%i==0) {
//				isPrime = "The given number is not a prime number";
//				break;
//			}
//		}
//		System.out.println(isPrime);
	
			//Method - 2
//			int num = 10;
			int count = 0;
			if(num>1) {
				for(int i = 1; i<=num ; i++) {
					if(num%i==0)
						count++;
					}
					if(count==2) {
						System.out.println("The given number is a prime number");
					}
					else {
						System.out.println("The given number is not a prime number");
					}	
				}
			else {
				System.out.println("The given number is not a prime number");

		}	
	}
}
	

