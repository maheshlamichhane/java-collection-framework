package collection.api.introduction.program;

import java.util.ArrayList;
import java.util.List;

public class Test {
	

	public static void main(String[] args) {
		
		int[] my_array = {1,2,3};
		for(int i = 0; i < my_array.length;i++) {
			System.out.println("Array Print "+my_array[i]);
		}
		
		List<Integer> my_array2 = new ArrayList<>();
		my_array2.add(4);
		my_array2.add(5);
		my_array2.add(6);
		
		for(Integer i : my_array2) {
			System.out.println("List Print "+i);
		}
		

	}

}
