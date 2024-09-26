package homework_4_objects.geometry;

public class TriangleDemo {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(0, 0, 3, 0, 0, 4);
        System.out.println("Triangle 1: " + t1);
        System.out.println("Perimeter of Triangle 1: " + t1.perimeter());
        System.out.println("Area of Triangle 1: " + t1.area());
        System.out.println("Center of Mass of Triangle 1: " + t1.centerOfMass());
        System.out.println("Is Triangle 1 Equilateral? " + t1.isEquilateral());
        System.out.println("Is Triangle 1 Isosceles? " + t1.isIsosceles());
        System.out.println("Is Triangle 1 Scalene? " + t1.isScalene());

        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 1);
        Point p3 = new Point(1, 5);
        Triangle t2 = new Triangle(p1, p2, p3);
        System.out.println("\nTriangle 2: " + t2);
        System.out.println("Perimeter of Triangle 2: " + t2.perimeter());
        System.out.println("Area of Triangle 2: " + t2.area());
        System.out.println("Center of Mass of Triangle 2: " + t2.centerOfMass());
        System.out.println("Is Triangle 2 Equilateral? " + t2.isEquilateral());
        System.out.println("Is Triangle 2 Isosceles? " + t2.isIsosceles());
        System.out.println("Is Triangle 2 Scalene? " + t2.isScalene());

        Triangle t3 = new Triangle(t1);
        System.out.println("\nTriangle 3 (Copy of Triangle 1): " + t3);

        t1.setPoint1(new Point(2, 2));
        System.out.println("\nUpdated Triangle 1: " + t1);
        System.out.println("New Perimeter of Triangle 1: " + t1.perimeter());
        System.out.println("New Area of Triangle 1: " + t1.area());
    }
}
