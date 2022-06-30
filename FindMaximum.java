import java.util.*;

public class FindMaximum {
    public int largestInt = 0;

    public void findMaximum(int e) {
        if (e > largestInt) {
            largestInt = e;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FindMaximum l = new FindMaximum();
        System.out.println("Input array size: ");
        int n = input.nextInt();
        System.out.println("\nInput the number of elements: ");
        for (int i = 0; i < n; i++) {
            int e = input.nextInt();
            l.findMaximum(e);
        }
        System.out.println("\nThe largest number is: " + l.largestInt);
    }
}
