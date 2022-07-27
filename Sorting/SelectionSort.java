package Sorting;

import java.util.*;

public class SelectionSort{
    public void selectionSort(int[] arr){
        int i, j;
        int max = 0;
        for (i = arr.length - 1; i > 0; i--){
            max = 0;
            for (j = 0; j <= i; j++) {
                if(arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        for (i = 0; i < arr.length; i++) {
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
        selectionSort(arr);
    }
    
    public static void main(String[] args){
        SelectionSort ss = new SelectionSort();
        ss.input();
    }
}