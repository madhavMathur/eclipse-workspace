package School.Holiday;

import java.util.Scanner;

public class RecFact {
	int n;
	int r;
	
	public RecFact() {
		n = 0;
		r = 0;
	}
	
	void readnum() {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		r = in.nextInt();
	}
	
	int factorial(int a) {
		if(a <= 1)
			return 1;
		else 
			return a * factorial(a - 1);
	}
	
	void factseries() {
		int val = factorial(n)/(factorial(r) * factorial(n - r));
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		RecFact rf = new RecFact();
		rf.readnum();
		rf.factseries();
	}
}

/* List of Variables
 * Name:	Type:	Use:			Scope:
 * n		int	    number			global
 * r		String	number			global
 * */

/* Output: 
 * javac RecFect.java
 * java RecFect 
 * 15 6
 * 5005
 * */
