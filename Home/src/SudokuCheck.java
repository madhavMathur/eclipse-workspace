import java.util.ArrayList;
import java.util.Scanner;

public class SudokuCheck {
	
	static ArrayList<Integer> values = new ArrayList<Integer>();
	static int[][] sod = new int[9][9];
	static final int rows = 9;
	static final int cols = 9;
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the sudoku: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				sod[i][j] = in.nextInt();
			}
		}
		// Initialise the values ArrayList
		for(int i = 1; i < 10; i++) {
			values.add(i);
		}
		
		boolean check1 = verticalCheck();
		boolean check2 = horizontalCheck();
	}

	private static boolean verticalCheck() {
		int num = 0;
		for(int i = 0; i < cols; i++) {
			for(int j = 0; j < rows; j++) {
				num = sod[j][i];
				if(values.contains(num)) {
					values.remove(num); 
				}
			}
		}
		
		if(values.size() == 0) return true;
		else return false;
	}
	
	private static boolean horizontalCheck() {
		int num = 0; 
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				num = sod[i][j];
				if(values.contains(num)) {
					values.remove(num); 
				}
			}
		}
		if(values.size() == 0) return true;
		else return false;
	}
	
	private static boolean boxCheck() {
		int n = 3, num = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				num = sod[i][j];
				for(int k = i + 1; k < n; k++) {
					for(int l = j + 1; l < n; l++) {
						if (num == sod[k][l]) return false;
						else continue;
					}
				}
			}
		}
		return false;
	}
}
