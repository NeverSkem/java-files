import java.util.*;

public class FizzBuzz {
    public void fizzBuzz(int n) {
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FizzBuzz fb = new FizzBuzz();
        System.out.println("Input array size: ");
        int n = input.nextInt();
        fb.fizzBuzz(+n);
    }
}