import java.util.Scanner;
public class MirrorMatrix {
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
        int[][] b = new int[m][m];
        for(int i = 0; i < m; i++) {
            int k = 0;
            for(int j = m - 1; j >= 0; j--) {
                b[i][k] = a[i][j];
                k++;
            }
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}