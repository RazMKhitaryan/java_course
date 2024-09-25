package homework_4_objects;

public class Line {
    private Point start;
    private Point end;

    public Line(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    public Line(Line x) {
        this.start = new Point(x.start);
        this.end = new Point(x.end);
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double[] getBeginXY() {
        return start.getXY();
    }

    public double[] getEndXY() {
        return end.getXY();
    }

    public void setBeginXY(double x, double y) {
        this.start.setXY(x, y);
    }

    public void setEndXY(double x, double y) {
        this.end.setXY(x, y);
    }

    public double length() {
        double xDiff = end.getX() - start.getX();
        double yDiff = end.getY() - start.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public Point midpoint() {
        double midX = (start.getX() + end.getX()) / 2;
        double midY = (start.getY() + end.getY()) / 2;
        return new Point(midX, midY);
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
