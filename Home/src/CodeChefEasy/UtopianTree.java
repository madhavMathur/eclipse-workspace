package CodeChefEasy;

import java.util.Scanner;
public class UtopianTree {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		int height = 1;
		int cycles;
		while(count < num) {
			cycles = in.nextInt();
			for(int i = 1; i < cycles; i++) {
				if (i % 2 == 0)
					height += 1;
				else
					height *= 2;
			}
			System.out.println(height);
			count++;
		}
	}
}
