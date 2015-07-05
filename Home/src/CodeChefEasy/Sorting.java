package CodeChefEasy;
import java.util.ArrayList;
import java.util.Scanner;
public class Sorting {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> less = new ArrayList<Integer>();
		ArrayList<Integer> greater = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		int num = in.nextInt();
		for(int i = 0; i < num; i++) {
			list.add(in.nextInt());
		}
		if(list.size() <= 1)
			System.out.println("0"); System.exit(0);
		int pivot = list.get((list.size() + 1) / 2);
		int count = 0;
		for(int i = 0; i < list.size(); i++) {
			count++;
			if (list.get(i) < pivot) {
				less.add(list.get(i));
			}
			else if (list.get(i) > pivot) {
				greater.add(list.get(i));
			}
		}
		System.out.println(count);
	}
}