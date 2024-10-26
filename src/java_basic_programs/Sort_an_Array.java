package java_basic_programs;

import java.util.Arrays;

public class Sort_an_Array {

		public static void main(String[] args) {
			//Integer
			int a[] = {9,8,7,6,5,4,3,2,1,0};
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
			
			//Float
			float b[] = {5,4.5f,8.2f,2.1f,6.3f,1.9f,1.8f,9.9f};
			Arrays.sort(b);
			System.out.println(Arrays.toString(b));
			
			//char
			char c[] = {'d','a','c','b','a'};
			Arrays.sort(c);
			System.out.println(Arrays.toString(c));
			
		}
}
