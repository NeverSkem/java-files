import java.util.*;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BubbleSort bs = new BubbleSort();
        System.out.println("Input array size: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("\nInput the number of elements: ");
        for (int i = 0; i < n; i++) {
            int elem = input.nextInt();
            arr[i] = elem;
        }
        bs.bubbleSort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}