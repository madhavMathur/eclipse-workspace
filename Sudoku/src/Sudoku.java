import java.util.ArrayList;
import java.util.Scanner;


public class Sudoku {
	
	int[][] grid;
	static boolean solved = false;
	ArrayList<Integer> all = new ArrayList<Integer>(); 
	
	public Sudoku() {
		grid = new int[9][9];
		inputGrid();
	}
	
	private static boolean check() {
		//check rows
		
		return false;
	}

	private void inputGrid() {
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				grid[i][j] = in.nextInt();
			}
		}
	}
	
	public static void main(String[] args) {
		new Sudoku();
		solved = check();
	}
}
