package homework_4_objects.geometry;

public class PolygonDemo {
    public static void main(String[] args) {

        double[] xCoords1 = {0, 4, 4, 0};
        double[] yCoords1 = {0, 0, 3, 3};
        Polygon polygon1 = new Polygon(xCoords1, yCoords1);
        System.out.println("Polygon 1: " + polygon1);
        System.out.println("Perimeter of Polygon 1: " + polygon1.perimeter());

        Point[] points = {
                new Point(1, 1),
                new Point(5, 1),
                new Point(4, 4),
                new Point(2, 4)
        };
        Polygon polygon2 = new Polygon(points);
        System.out.println("\nPolygon 2: " + polygon2);
        System.out.println("Perimeter of Polygon 2: " + polygon2.perimeter());

        Polygon polygon3 = new Polygon(polygon1);
        System.out.println("\nPolygon 3 (Copy of Polygon 1): " + polygon3);
        System.out.println("Perimeter of Polygon 3: " + polygon3.perimeter());

        polygon1.setTop(0, new Point(1, 1));
        System.out.println("\nModified Polygon 1: " + polygon1);
        System.out.println("Perimeter of Modified Polygon 1: " + polygon1.perimeter());
    }
}
