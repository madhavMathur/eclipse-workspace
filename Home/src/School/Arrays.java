package School;

import java.util.Scanner;

public class Arrays {

	static int[][] array;
		
	private static void initArray(int size) {
		Scanner in = new Scanner(System.in);
		array = new int[size][size];
		for(int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = in.nextInt();
			}
		}
	}
	
	private static int sumOfElements(int[][] a) {
		int sum = 0; 
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}
	
	private static void transposeElements() {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				array[i][j] = array[j][i];
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println();
		
	}
	
}
