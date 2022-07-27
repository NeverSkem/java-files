package Searching;

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

    public void check(int[] arr, int n) {
        int index = linearSearch(arr, n);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinearSearch ls = new LinearSearch();
        System.out.print("Input array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("\nInput the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("\nInput the number to search: ");
        int num = input.nextInt();
        ls.check(arr, num);
    }
}
