import java.util.*;

public class ArrayReverse {
    public void reverse(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = in.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
            array1[i] = in.nextInt();
        for(int i=0;i<n/2;i++){
            int ans = array1[i];
            array1[i] = array1[n-i-1];
            array1[n-i-1] = ans;
        }
            System.out.print("{ ");
        for(int i=0;i<n;i++)
            System.out.print(array1[i] + " ");
            System.out.println("}");
    }

    public static void main(String[] args){
        ArrayReverse ar = new ArrayReverse();
        ar.reverse();
    }
}

