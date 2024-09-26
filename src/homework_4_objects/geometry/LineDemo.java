package homework_4_objects.geometry;

public class LineDemo {
    public static void main(String[] args) {

        Line line1 = new Line(1, 2, 4, 6);
        System.out.println("Line 1: " + line1);
        System.out.println("Length of Line 1: " + line1.length());
        System.out.println("Midpoint of Line 1: " + line1.midpoint());

        Point p1 = new Point(3, 5);
        Point p2 = new Point(7, 9);
        Line line2 = new Line(p1, p2);
        System.out.println("\nLine 2: " + line2);
        System.out.println("Length of Line 2: " + line2.length());
        System.out.println("Midpoint of Line 2: " + line2.midpoint());

        Line line3 = new Line(line1);
        System.out.println("\nLine 3 (Copy of Line 1): " + line3);

        line1.setStart(line2.midpoint());
        System.out.println("\nUpdated Line 1: " + line1);
        System.out.println("New Length of Line 1: " + line1.length());
        System.out.println("New Midpoint of Line 1: " + line1.midpoint());

    }

}
