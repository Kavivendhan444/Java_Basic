package java_basic_programs;

import java.util.Arrays;

public class Merge_Two_Arrays {
	public static void main(String[] args) {
		int a[] = {0,1,4,7,8} ;
		int b[] = {2,3,5,6,9};
		int[] merge = new int[a.length  + b.length];
		
		System.arraycopy(a, 0, merge, 0, a.length);
		System.arraycopy(b, 0, merge, a.length, b.length);
		System.out.println(Arrays.toString(merge));
		
	}
}
