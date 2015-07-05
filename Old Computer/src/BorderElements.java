import java.util.Scanner;
public class BorderElements {
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
        int sum = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < m; j++) {
                if((i == 0 || j == 0) || (i == m -1 || j == m -1)) {
                    sum += a[i][j];
                }
            }
        }
        System.out.print(sum);
    }
}