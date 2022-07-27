package Searching;

import java.util.*;

public class BinarySearch {
    public int binarySearch(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (n == arr[mid]) {
                return mid;
            } else if (n < arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public void check(int[] arr, int n) {
        int index = binarySearch(arr, n);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();
        System.out.print("Input array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("\nInput the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("\nInput the number to search: ");
        int num = input.nextInt();
        bs.check(arr, num);
    }
}