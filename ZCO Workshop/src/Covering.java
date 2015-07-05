import java.util.ArrayList;
import java.util.Scanner;
public class Covering {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<String> sets = new ArrayList<String>();
		String sum = "";
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			for(int j = a; j <= b; j++) {
				sum += Integer.toString(j);
			}
			sets.add(sum);
		}
		boolean flag = false;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				char a = sets.get(i).charAt(j);
				for(int k = i + 1; k < n; k++) {
					if(sets.get(k).contains(Character.toString(a))) {
						flag = true;
						sets.remove(i);
						sets.remove(j);
						sets.add(Character.toString(a));
					}
				}
			}
		}
	}
}
