
public class Fibonnaci {
	
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int sum = num1 + num2;
		for(int i = 0; i < 100; i++) {
			System.out.print(num1+" "+num2);
			num1 = sum;
			num2 = sum + num2;
			sum = num2;
		}
	}
	
}
