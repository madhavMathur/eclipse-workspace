public class BinarySearch {
   
    /* Searches for an element in an array */
    public static boolean binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        int mid;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (key == a[mid]) {
                return true;
            }
            else if (key > a[mid]) {
                lo = mid + 1;
            }
            else if (key < a[mid]) {
                hi = mid - 1;
            }
        }
        return false;
    }    
}