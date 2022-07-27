import java.util.*;

public class Distance {
    public void distance() {
        Scanner input = new Scanner(System.in);
        double distance = 0;
        System.out.print("Input the TIME in minutes: ");
        int time = input.nextInt();
        distance = time * 50 / 60;
        System.out.println("The DISTANCE is: " + distance);
    }

    public static void main(String[] args) {
        Distance d = new Distance();
        d.distance();
    }
}