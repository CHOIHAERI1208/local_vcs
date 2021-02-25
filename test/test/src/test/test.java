package test;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		
		 int[] arr = new int[5];

		 int n = 10;

		 for ( int i = 0; i < arr.length; i++ ) {

			 arr[i] = n;

			 n += 10;

		}

		 arr[arr.length-1] = 100;
		 
		 System.out.println(Arrays.toString(arr));

		 
		 
	}
	


}
