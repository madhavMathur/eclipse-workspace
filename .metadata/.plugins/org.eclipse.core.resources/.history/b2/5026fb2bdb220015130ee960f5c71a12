import java.util.Scanner;
public class Practical2015_1
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int m=sc.nextInt();

        if(m<3 || m>9)
            System.out.println("Size Out Of Range");
        else
        {
            int A[][]=new int[m][m];

            /* Inputting the matrix */
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print("Enter an element : ");
                    A[i][j]=sc.nextInt();
                }
            }

            /* Printing the original matrix */
            System.out.println("*************************");
            System.out.println("The Original Matrix is : ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(A[i][j]+"\t");
                }
                System.out.println();
            }
            System.out.println("*************************");

            int B[][]=new int[m][m];
            int x;

            /*Rotation of matrix begins here */
            for(int i=0;i<m;i++)
            {
                x = m-1;
                for(int j=0;j<m;j++)
                {
                    B[i][j]=A[x][i];
                    x--;
                }
            }

            /* Printing the rotated matrix */
            System.out.println("Matrix After Rotation is : ");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(B[i][j]+"\t");
                }
                System.out.println();
            }
        }
    }
}