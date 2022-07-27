package Sorting;

import java.util.*;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.println("\nInput the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("\nSorted array: ");
        bubbleSort(arr);
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.input();
    }
}