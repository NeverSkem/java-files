import java.util.*;

public class LinearSearch {
    public int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearSearch ls = new LinearSearch();
        System.out.println("Input array size: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("\nInput the number of elements: ");
        for (int i = 0; i < n; i++) {
            int elem = input.nextInt();
            arr[i] = elem;
        }
        System.out.println("\nInput the number to search: ");
        int num = input.nextInt();
        int index = ls.linearSearch(arr, num);
        if (index == -1) {
            System.out.println("\nThe number " + num + " is not in the array.");
        } else {
            System.out.println("\nThe number " + num + " is in the array at index " + index + ".");
        }
    }
}
