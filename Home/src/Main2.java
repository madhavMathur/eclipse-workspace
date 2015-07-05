import java.util.Scanner;


public class Main2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 1; i <= T; i++) {
			int X = in.nextInt();
			int R = in.nextInt();
			int C = in.nextInt();
			String winner = "";
			if((R*C % X == 0 && X <= R*C) || (X == 1 && R*C > 1)) {
				winner = "GABRIEL";
			} else winner = "RICHARD";
			System.out.println("Case #"+i+": "+winner);
		}
	}
}