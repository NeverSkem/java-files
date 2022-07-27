package Arrays.SingleArray.ArrayReverse;

import java.util.*;

public class ArrayReverse {
    public void reversedArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the array size: ");
        int n = input.nextInt();
        int[] array1 = new int[n];
        System.out.println("Input the elements");
        for (int i = 0; i < n; i++) {
            array1[i] = input.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            int ans = array1[i];
            array1[i] = array1[n - i - 1];
            array1[n - i - 1] = ans;
        }
        System.out.print("{ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("}");
    }
}