package homework;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int array[] = {2, 4, 1 , 7, 4, 8, 3, 2, 9, 6};
		Arrays.sort(array);
		
		for( int i = 0; i <= array.length - 1; i++) {
			System.out.println(array[i]);
		}
	}

}
