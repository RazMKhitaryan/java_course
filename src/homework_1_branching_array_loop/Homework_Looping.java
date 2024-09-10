package homework_1_branching_array_loop;

public class Homework_Looping {
    public static void main(String[] args) {
        //----------------exercise 1
        System.out.println("-----exercise 1");

        int a = 5333333;
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        System.out.println(count + " digits");

        //----------------exercise 2
        System.out.println("-----exercise 2");

        int[] num = {0, 0, 8, 107, 1, 2, 3, 6, 88, 5, 4, 5, 45};
        int max = 0;
        int min = 80;

        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }

        }
        System.out.println(max + " / " + min);

        //----------------exercise 3
        System.out.println("-----exercise 3");

        int aa = 50;
        int bb = 10;
        String condition = "no";
        do {
            System.out.println(aa + bb);
        } while (condition == "yes");

        //----------------exercise 4
        System.out.println("-----exercise 4");

        int n = 5;
        int k = 5;
        int temp = 1;
        for (int i = 0; i < k; i++) {
            temp = temp * n;
        }
        System.out.println(temp);

        //----------------exercise 5
        System.out.println("-----exercise 5");


        for (int i = 1; i <= 500; i++) {
            int num1 = i % 10;
            int num2 = (i / 10) % 10;
            int num3 = (i / 100) % 10;

            int sum = (num1 * num1 * num1) + (num2 * num2 * num2) + (num3 * num3 * num3);

            if (sum == i) {
                System.out.println(i + " is Armstrong");
            }
        }

        //----------------exercise 6
        System.out.println("-----exercise 6");

        n = 10;
        int first = 1;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                System.out.print(1+",");
                continue;
            }
            temp = first + second;
            System.out.print(temp+",");

            first = second;
            second = temp;
        }
        System.out.println();

        //----------------exercise 7
        System.out.println("-----exercise 7");

        n = 10;
        double x = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                x = x - (1.0 / i);
            } else {
                x = x + (1.0 / i);
            }
        }
        System.out.println(n + ":" + x);


        //----------------exercise 8
        System.out.println("-----exercise 8");
        n = 3;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}


