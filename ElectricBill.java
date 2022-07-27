import java.util.*;

public class ElectricBill {
    public void electricBill() {
        Scanner input = new Scanner(System.in);
        double bill = 0;
        System.out.print("Input the kWh consumed: ");
        int kwh = input.nextInt();
        if (kwh <= 250) {
            bill = kwh * 7.5;
        } else {
            bill = (250 * 7.5) + ((kwh - 250) * 8.5);
        }
        bill = bill + (bill * 0.1);
        System.out.println("Bill: " + bill);
    }

    public static void main(String[] args) {
        ElectricBill bill = new ElectricBill();
        bill.electricBill();
    }
}