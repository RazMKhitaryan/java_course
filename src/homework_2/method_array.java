package homework_2;

import java.util.Random;
import java.util.Scanner;

public class method_array {
    public static void main(String[] args) {
        //-----------exercise 1
        System.out.println("-----------exercise 1");

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][a.length - 1]);
        }

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i][a.length - 2]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][a.length - 3]);
        }

        //-----------exercise 2
        System.out.println("-----------exercise 2");
        System.out.println(sum(2, 6));
        System.out.println(sum("aa", "bb"));


        //-----------exercise 3
        System.out.println("-----------exercise 3");

        int bb = new Random().nextInt(10);
        //  System.out.println(bb);  for debug

        Scanner scanner = new Scanner(System.in);
        boolean aa = true;
        while (aa) {
            System.out.println("guess the number , please insert number");
            int i = scanner.nextInt();

            if (bb == i) {
                System.out.println("you guess right number");
                aa = false;
            }

            if (i > bb) {
                System.out.println("Too high , try again");
            }

            if (i < bb) {
                System.out.println("Too low , try again");
            }
        }
        System.out.println();
        System.out.println("---------part 2");
        System.out.println("set a range first number");
        int ii = scanner.nextInt();
        System.out.println("set second number");
        int x = scanner.nextInt();
        System.out.println("please set number in your mind between this range");
        int guess = scanner.nextInt();
        System.out.println("now i will guess your number");
        aa = true;
        while (aa) {
            int i = new Random().nextInt(10);

            if (guess == i) {
                System.out.println("yeeesss i guess the right number " + i);
                aa = false;
            }

            if (i > guess) {
                System.out.println(" hmm Too high , i will try again " + i);
            }

            if (i < guess) {
                System.out.println("hmm Too low , try again " + i);
            }
        }

    }

    public static String sum(String a, String b) {
        return a + b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}

