import java.util.*;

public class FindingPrimes {
    public static List<Integer> findPrimes(int a, int z){
        List<Integer> primes = new ArrayList<Integer>();
        for(int i=a;i<=z;i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }
    
    private static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting point: ");
        int a = input.nextInt();
        System.out.print("Enter the ending point: ");
        int z = input.nextInt();
        List<Integer> primes = findPrimes(a,z);
        for(int i=0;i<primes.size();i++){
        System.out.print(primes.get(i)+" ");
        }
    }
}