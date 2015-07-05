import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int counter = 0;
		/*
		int[] days, fines;
		while(counter < num) {
			int minFine = 0;
			int fine = 0;
			int numJobs = in.nextInt();
			days = new int[numJobs];
			fines = new int[numJobs];
			for(int i = 0; i < numJobs; i++) {
				days[i] = in.nextInt();
				fines[i] = in.nextInt();
			}
			for(int i = 1; i < numJobs; i++) {
				minFine += fines[i] * days[0];
			}
			for(int i = 0; i < numJobs; i++) {
				for(int j = i + 1; j < numJobs; j++) {
					fine += (fines[j]) * days[i];
				}
				if (fine < minFine) {
					minFine = fine;
				}
			}
			System.out.println(minFine);
			counter++;
		}
		in.close();
		*/
		while(counter < num) {
			int numJobs = in.nextInt();
			double[] ranking = new double[numJobs];
			int jobnum;
			for(int i = 0; i < numJobs; i++) {
				ranking[i] = (double) (in.nextDouble() / in.nextDouble());
				jobnum = i;
			}
			Arrays.sort(ranking);
			for(int i = 0; i < ranking.length; i++) {
				System.out.println(ranking[i]);
			}
		}
		in.close();
		}
	}

