package homework_3;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // --------exercise 1
        System.out.println("--------exercise 1");
        System.out.println("please write any text");
        System.out.println("the string has " + new Scanner(System.in).nextLine().length() + " characters.");


        // --------exercise 2
        System.out.println("--------exercise 2");
        String a = "hello";
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

        // --------exercise 3
        System.out.println("--------exercise 3");
        String b = "hello";
        int count = 4;
        for (int i = 0; i < count; i++) {
            System.out.print(b);
        }
    }
}
