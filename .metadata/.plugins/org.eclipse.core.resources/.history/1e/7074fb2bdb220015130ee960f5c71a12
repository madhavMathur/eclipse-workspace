import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a;
        System.out.println("Enter");
        int m = in.nextInt();
        a = new int[m][m];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = i + 1; j < m; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
