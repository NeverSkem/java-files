package Sorting;

import java.util.*;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 1; i < n; i++) {
            temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
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
        insertionSort(arr);
    }
    
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        is.input();
    }    
}
