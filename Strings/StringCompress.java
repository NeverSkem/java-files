package Strings;

import java.util.*;

public class StringCompress {
    public String compress(char[] str) {
        String sc = "";
        int count = 1;
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i] == str[i + 1]) {
                count++;
            } else if (count > 1) {
                sc += count;
                sc += str[i];
                count = 1;
            } else {
                sc += str[i];
            }
        }
        if (count > 1) {
            sc += count;
            sc += str[str.length - 1];
        } else {
            sc += str[str.length - 1];
        }
        return sc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringCompress comp = new StringCompress();

        System.out.print("Input string: ");
        String str = input.nextLine();
        System.out.println("Compressed string: " + comp.compress(str.toCharArray()));
    }
}