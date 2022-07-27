package Interface.Playable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input array size: ");
        int n = input.nextInt();

        Playable[] instruments = new Instrument[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Input instrument " + (i + 1) + " name: ");
            String name = input.next();
            instruments[i] = new Instrument(name);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Instrument " + (i + 1) + ": " + instruments[i] + " | ");
            instruments[i].play();
        }

        Playable[] guitars = new Guitar[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Input guitar " + (i + 1) + " name: ");
            String name = input.next();
            guitars[i] = new Guitar(name);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Guitar " + (i + 1) + ": " + guitars[i] + " | ");
            guitars[i].play();
        }
    }
}