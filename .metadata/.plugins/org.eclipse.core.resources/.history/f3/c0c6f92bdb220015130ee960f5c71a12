import java.util.Scanner;
public class SumOfDiagonalElements {
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
        //right to left diagonal
        for(int i = 0; i < m; i++) {
            sum += a[i][i];
        }
        
        //left to right diagonal
        for(int i = m-1; i >= 0; i--) {
            sum += a[m - 1- i][i];
        }
        System.out.println(sum);
    }
}