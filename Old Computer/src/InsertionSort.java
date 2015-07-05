import java.util.Scanner;

public class InsertionSort {
    public static int[] insertionSort(int[] a) {
        int i;
        for(int j = 1; j < a.length; j++) {
            int key = a[j];
            for(i = j - 1; (i >= 0)&&(a[i] > key); i--) {
                a[i + 1] = a[i];
            }
            a[i + 1] = key;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an array of length 10: ");
        int[] A = new int[10];
        for(int i = 0; i < 10; i++) {
            A[i] = in.nextInt();
        }
        int[] aa = insertionSort(A);
        for(int i: aa)
            System.out.println("-> " + i);
    }
}