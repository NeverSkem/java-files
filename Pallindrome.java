import java.util.*;

public class Pallindrome{
    public boolean pallindrome(char[] str){
        boolean ans = false;
        int i = 0;
        int j = str.length-1;
        while(i < j){
            if(str[i] == str[j]){
                ans = true;
            }
            i++;
            j--;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Pallindrome p = new Pallindrome();
        System.out.println("Input string: ");
        String str = input.nextLine();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            arr[i] = Character.toLowerCase(arr[i]);
        }
        if(p.pallindrome(arr)){
            System.out.println("\nPallindrome.");
        }else{
            System.out.println("\nNot pallindrome.");
        }
    }
}