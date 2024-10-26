package java_basic_programs;

import java.util.HashSet;

public class Remove_Duplicates_From_Array {
	
		public static void main(String[] args) {
			int arr[] = {1,1,2,3,3,4,5,5,6,7,7,8,9,9};
			HashSet<Integer> set = new HashSet<>();
			for (Integer num : arr) {
				set.add(num);
			}
			System.out.println(set);
		}
}
