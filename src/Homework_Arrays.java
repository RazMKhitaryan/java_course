public class Homework_Arrays {
    public static void main(String[] args) {
        //----------------exercise 1
        System.out.println("-----exercise 1");

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


        //----------------exercise 2
        System.out.println("-----exercise 2");

        num = new int[]{0, 2, 107, 1, 2, 3, 6, 88, 5, 4, 5, 45};
        int[] a = new int[num.length];
        int n = 2;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (num[i] != n) {
                a[count] = num[i];
                count++;
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }

        //----------------exercise 3
        System.out.println("-----exercise 3");

        num = new int[]{1, 2, 3, 4, 5};
        int[] fin = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] + num[j] == 10) {
                    fin[i] = num[i];
                }
                //       System.out.println(fin[i]);
            }
        }


    }
}
