package CodeChefEasy;
import java.util.Scanner;
public class Chefgr {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int counter = 0;
		int[] cols;
		while (counter < num) {
			int numCols = in.nextInt();
			int numGround = in.nextInt();
			cols = new int[numCols];
			int high = 0;
			for(int i = 0; i < numCols; i++) {
				cols[i] = in.nextInt();
				if(cols[i] > cols[high])
					high = i;
			}
			for(int i = 0; i < numCols; i++) {
				for(int j = cols[i]; j < cols[high]; j++) {
					if (high == i) {
						break;
					}
					numGround--;
				}
			}
			if (numGround == 0)
				System.out.println("Yes");
			else
				System.out.println("No");
			counter++;
		}
	}
}