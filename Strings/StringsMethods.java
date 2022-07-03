package Strings;

import java.util.*;

public class StringsMethods{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Add your name: ");
        String str = "Hello World! This is " + input.nextLine();
        System.out.println("\nOutput String: " + str);
        System.out.println("\n---STRING METHODS---");
        System.out.println("toUpperCase(): " + str.toUpperCase());
        System.out.println("toLowerCase(): " + str.toLowerCase());
        System.out.println("substring(13): " + str.substring(13));
        System.out.println("substring(6,12): " + str.substring(6,12));
        System.out.println("length(): " + str.length());
        System.out.println("charAt(7): " + str.charAt(7));
        System.out.println("indexOf('T'): " + str.indexOf('T'));
        System.out.println("indexOf('l',1): " + str.indexOf('l',1));
        System.out.println("indexOf(\"World\"): " + str.indexOf("World"));
        System.out.println("indexOf(\"This\",5): " + str.indexOf("This",5));
        System.out.println("lastIndexOf('s'): " + str.lastIndexOf('s'));
        System.out.println("lastIndexOf('i',21): " + str.lastIndexOf('i',21));
        System.out.println("lastIndexOf(\"is\"): " + str.lastIndexOf("Hello"));
        System.out.println("lastIndexOf(\"is\",9): " + str.lastIndexOf("Hello",9));
        System.out.println("replace('e','o'): " + str.replace('e','o'));
        System.out.println("replace(\"Hello\",\"Hi\"): " + str.replace("Hello","Hi"));
        System.out.println("concat(\"!\"): " + str.concat("!"));
        System.out.println("equals(\"Hello Philippines, Hello World!\")?: " + str.equals("Hello Philippines, Hello World!"));
    }
}