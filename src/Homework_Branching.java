public class Homework_Branching {
    public static void main(String[] args) {
        //----------------exercise 1
        System.out.println("-----exercise 1");
        int a = 6;
        int b = 5;
        int c = 4;

        if (a < b && b < c) {
            System.out.println("increasing");
        } else if (a > b && b > c) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }


        //----------------exercise 2
        System.out.println("-----exercise 2");
        int d = 2024;

        if (d % 400 == 0) {
            System.out.println("leap year");
        } else if (d % 100 == 0) {
            System.out.println("not leap");
        } else if (d % 4 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("not leap");
        }

        //----------------exercise 3
        System.out.println("-----exercise 3");
        char e = '/';
        int f = 10;
        int g = 5;

        switch (e) {
            case '+':
                System.out.println(f + g);
                break;
            case '-':
                System.out.println(f - g);
                break;
            case '*':
                System.out.println(f * g);
                break;
            case '/':
                if (g != 0) {
                    System.out.println(f / g);
                } else {
                    System.out.println("can  not devide on 0");
                }
                break;
        }


        //----------------exercise 4
        System.out.println("-----exercise 4");
        String semester = "fall";
        String program = "ec";

        String fall = "Fall";
        String spring = "Spring";
        String csFall = "intodruction to computer sciense";
        String ecFall = "English Literature";
        String csSpring = "Object oriented programming";
        String ecSpring = "introduction to journalism";

        switch (semester) {
            case "fall":
                switch (program) {
                    case "ec":
                        System.out.println(semester + " /" + ecFall);
                        break;
                    case "cs":
                        System.out.println(semester + " /" + csFall);
                }
                break;
            case "spring": {
                switch (program) {
                    case "ec":
                        System.out.println(semester + " /" + ecSpring);
                        break;
                    case "cs":
                        System.out.println(semester + " /" + csSpring);
                }
                break;
            }
        }

    }
}