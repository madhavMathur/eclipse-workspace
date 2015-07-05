package School.Holiday;

public class DigiNumber {
	long num;
	
	public DigiNumber() {
		num = 0;
	}
	
	public DigiNumber(long n) {
		num = n;
	}
	
	void digitfrequency() {
		String s = Long.toString(num);
		int[] freq = new int[s.length()];
		char[] c = new char[s.length()];
		int counter1 = 0;
		int counter2 = 0;
		for(int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == s.lastIndexOf(s.charAt(i))) {
				for(int j = i; j > 0; j--) {
					if(s.charAt(j) == s.charAt(i)) {
						counter1++;
					}
				}
				c[counter2] = s.charAt(i);
				freq[counter2] = counter1;
				counter2++;
				counter1 = 0;
			}
		}
		for(int i = 0; i < s.length(); i++) {
			System.out.println(c[i] + " -> " + freq[i]);
		}
	}
	
	long sumDigits(long n) {
		return n == 0 ? 0 : n % 10 + sumDigits(n/10);
	}
	
	void printsum() {
		System.out.println(sumDigits(num));
	}
	
	public static void main(String[] args) {
		DigiNumber dg = new DigiNumber(11223232);
		dg.digitfrequency();
		dg.printsum();
	}
}

/* List of Variables
 * Name:	Type:	Use:			Scope:
 * num		long	a number		global
 * s		String	num as string	local
 * freq		int[]	freq of digit	local
 * c		char[]	digit character	local
 * counter1	int		count frequency	local
 * counter2	int		count digits	local
 * */

/* Output: 
 * javac DigiNumber.java
 * java DigiNumber 
 * 1 -> 2
 * 2 -> 4
 * 3 -> 2
 * 16
 * */
