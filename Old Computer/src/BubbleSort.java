public class BubbleSort {
    public static int[] bubbleSort(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            for(int j = 0; j < a.length - i - 1; i++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }
}