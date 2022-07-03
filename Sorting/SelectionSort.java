import java.util.*;

public class SelectionSort{
    public void selectionSort(int[] arr){
        int i,j;
        int max=0;
        for(i=arr.length-1;i>0;i--){
            max=0;
            for(j=0;j<=i;j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SelectionSort ss = new SelectionSort();
        System.out.println("Input array size: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("\nInput the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt(); 
        }
        ss.selectionSort(arr);
        System.out.println("\nThe sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}