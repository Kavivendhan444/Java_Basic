package java_basic_programs;

public class Largest_Element_in_Array {
	public static void main(String[] args) {
	
		int a[] = {1,3,5,7,9};
		int largest = a[0];
		for (int num : a) {
			if(num>largest) {
				largest=num;
			}
		}
		System.out.println(largest);
		
		
		
	}
}
