package homework_4_objects.geometry;

import java.util.Arrays;

public class Polygon {
    private Point[] top;

    public Polygon(double[] x, double[] y) {
        int n = x.length;
        this.top = new Point[n];
        for (int i = 0; i < n; i++) {
            top[i] = new Point(x[i], y[i]);
        }
    }

    public Polygon(Point[] points) {
        this.top = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            top[i] = new Point(points[i]);
        }
    }

    public Polygon(Polygon p) {
        this.top = new Point[p.top.length];
        for (int i = 0; i < p.top.length; i++) {
            this.top[i] = new Point(p.top[i]);
        }
    }

    public Line[] getEdges() {
        Line[] edges = new Line[top.length];
        for (int i = 0; i < top.length; i++) {
            edges[i] = new Line(top[i], top[(i + 1) % top.length]);
        }
        return edges;
    }

    public double perimeter() {
        double perimeter = 0;
        for (Line edge : getEdges()) {
            perimeter += edge.length();
        }
        return perimeter;
    }

    public Point[] getTop() {
        return top;
    }

    public void setTop(Point[] top) {
        this.top = top;
    }

    public Point getTop(int index) {
        return top[index];
    }

    public void setTop(int index, Point point) {
        top[index] = point;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "top=" + Arrays.toString(top) +
                '}';
    }
}
