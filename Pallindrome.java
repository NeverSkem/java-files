import java.util.*;

public class Pallindrome{
    public boolean pallindrome(char[] str) {
        boolean ans = false;
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            if (str[i] != str[j]) {
                ans = false;
                break;
            }
                ans = true;
                i++;
                j--;
        }
        return ans;
    }

    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            str = str.toLowerCase().replace(" ", "");
        }
        if (pallindrome(str.toCharArray())) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }

    public static void main(String[] args) {
        Pallindrome pall = new Pallindrome();
        pall.display();
    }
}