import java.util.*;

public class FindMaximum {
    public void findMaximum() {
        Scanner input = new Scanner(System.in);
        int largestInt = 0;
        System.out.print("Input array size: ");
        int size = input.nextInt();
        System.out.println("\nInput the elements: ");
        for (int i = 0; i < size; i++) {
            int num = input.nextInt();
            if (num > largestInt) {
                largestInt = num;
            }
        }
        System.out.println("\nLargest number: " + largestInt);
    }

    public static void main(String[] args) {
        FindMaximum fm = new FindMaximum();
        fm.findMaximum();
    }
}