import java.util.Scanner;


public class Main {
	
	static int[] a;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int i = 1; i <= T; i++) {
			int len = in.nextInt() + 1;
			a = new int[len];
			String s = in.nextLine();
			
			for(int j = 0; j < len; j++)
				a[j] = Integer.parseInt(Character.toString(s.charAt(i)));
			System.out.println("Case #"+i+": "+getFriends(a));
		}
	}
	
	public static int getFriends(int[] arr) {
		if(arr.length == 1) {
			return (arr[0] > 0)? 0 : 1;
		}
		else {
			int count = 0;
			int friends = 0;
			for(int i = 0; i < arr.length; i++) {
				int required = i;
				count -= required;
				if(count >= 0)
					count += arr[i];
			}
			if(count < 0)	
				return (count *= -1);
			return 0;
		}
	}
}