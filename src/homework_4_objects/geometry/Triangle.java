package homework_4_objects.geometry;

public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(double x1, double x2, double y1, double y2, double x3, double y3) {
        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
    }

    public Triangle(Point p1, Point p2, Point p3) {
        this.point1 = new Point(p1);
        this.point2 = new Point(p2);
        this.point3 = new Point(p3);
    }

    public Triangle(Triangle t) {
        this.point1 = new Point(t.point1);
        this.point2 = new Point(t.point2);
        this.point3 = new Point(t.point3);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    private double distance(Point p1, Point p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double perimeter() {
        return distance(point1, point2) + distance(point2, point3) + distance(point3, point1);
    }

    public double area() {
        double a = distance(point1, point2);
        double b = distance(point2, point3);
        double c = distance(point3, point1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public Point centerOfMass() {
        double x = (point1.getX() + point2.getX() + point3.getX()) / 3;
        double y = (point1.getY() + point2.getY() + point3.getY()) / 3;
        return new Point(x, y);
    }

    //havasarakoxm
    public boolean isEquilateral() {
        double a = distance(point1, point2);
        double b = distance(point2, point3);
        double c = distance(point3, point1);
        return a == b && b == c;
    }

    //havasarasrun
    public boolean isIsosceles() {
        double a = distance(point1, point2);
        double b = distance(point2, point3);
        double c = distance(point3, point1);
        return a == b || b == c || c == a;
    }

    //havasarasrun chi
    public boolean isScalene() {
        return !isIsosceles();
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                '}';
    }
}


