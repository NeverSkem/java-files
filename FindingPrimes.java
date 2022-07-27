import java.util.*;

public class FindingPrimes {
    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> inputPrimes() {
        Scanner input = new Scanner(System.in);
        List<Integer> primes = new ArrayList<Integer>();
        System.out.print("Input start number: ");
        int a = input.nextInt();
        System.out.print("Input end number: ");
        int z = input.nextInt();
        for (int i = a; i <= z; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        for (int i = 0; i < primes.size(); i++) {
            System.out.print(primes.get(i) + " ");
        }
        return primes;
    }

    public static void main(String[] args) {
        FindingPrimes fp = new FindingPrimes();
        fp.inputPrimes();
    }
}