package CodeChefEasy;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<String> list = new ArrayList<String>();
	
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of the string");
		int n = in.nextInt();
		f(n,"");
		System.out.println(list);
	}
	
	public static void f(int n, String s) {
		if (n == 0) {
			list.add(s);
		}
		else if (n > 0) {
			f(n-1, s+"1");
			f(n-2, s+"00");
		}
	}
}