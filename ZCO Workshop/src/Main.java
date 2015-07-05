import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int counter = in.nextInt();
		for(int z = 0; z < counter; z++) {
			int size = in.nextInt();
			char[][] grid = new char[size][size];
			for(int i = 0; i < size; i++) {
				for(int j = 0; j < size; j++) {
					grid[i][j] = in.next("").charAt(0);
				}
			}
		}
	}
}