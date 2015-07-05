import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int num = in.nextInt();
        String s = Integer.toString(num);
        String revs = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            revs += s.charAt(i);
        }
        int pal = Integer.parseInt(revs);
        if(pal == num)
            System.out.println("Palindrome!");
        else
            System.out.println("Not Palindrome");
    }
}