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
        System.out.println();

        //---------recursion-------
        // --------exercise 2
        System.out.println("--------exercise 2");
        int n = 12;
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();

        // --------exercise 3
        System.out.println("--------exercise 3");
        System.out.println(fact(6));
        System.out.println();


        // --------exercise 4
        System.out.println("--------exercise 4");
        System.out.println(pow(2, 3));
        System.out.println();


        // --------exercise 5
        System.out.println("--------exercise 5");
        int aa[] = {5, 6, 7, 77, 899, 40, 5254, 667};
        System.out.println("min is: " + findMin(aa, aa.length));
        System.out.println("max is: " + findMax(aa, aa.length));
        System.out.println();

        // --------exercise 6
        System.out.println("--------exercise 6");
        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
        }
        System.out.println();
        reverseOrder(aa, aa.length - 1);
        System.out.println();


        // --------exercise 7
        System.out.println("--------exercise 7");

        String x = "aabbaa";
        isPolidrome(x);
        System.out.println();

        // --------exercise 8
        System.out.println("--------exercise 8");
        System.out.println(sumDigits(123));

    }


    public static int fib(int t) {
        if (t == 0) {
            return 0;
        } else if (t == 1) {
            return 1;
        }
        return fib(t - 1) + fib(t - 2);
    }

    public static int fact(int t) {
        if (t == 1) {
            return 1;
        }
        t = t * fact(t - 1);
        return t;
    }

    public static int pow(int n, int k) {
        if (k == 0)
            return 1;
        return n * pow(n, k - 1);
    }

    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int min = findMin(arr, n - 1);
        if (arr[n - 1] < min) {
            return arr[n - 1];
        } else {
            return min;
        }
    }

    public static int findMax(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int max = findMax(arr, n - 1);
        if (arr[n - 1] > max) {
            return arr[n - 1];
        } else {
            return max;
        }
    }

    public static void reverseOrder(int[] a, int n) {
        if (n < 0) {
            return;
        }
        System.out.print(a[n] + " ");
        reverseOrder(a, n - 1);
    }

    public static void isPolidrome(String x) {
        String yy = "";
        for (int i = x.length() - 1; i > -1; i--) {
            yy += x.charAt(i);
        }
        if (x.equals(yy)) {
            System.out.println(x + " is a palindrome");
        } else {
            System.out.println(x + " is not palindrome");

        }
    }

    public static int sumDigits(int x) {
        if (x == 0)
            return 0;
        return (x % 10) + sumDigits(x / 10);
    }
}


