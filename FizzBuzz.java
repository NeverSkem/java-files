import java.util.*;

public class FizzBuzz {
    public void fizzBuzz() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array size: ");
        int size = input.nextInt();
        for (int i = 1; i <= size; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz();
    }
}