public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2){
        return Math.sqrt(Math.pow(x - p2.x, 2) + Math.pow(y - p2.y, 2));
    }
}

class TestPoints {

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public static void main(String[] args) {
        Point a1 = new Point(1, 1);
        Point a2 = new Point(3, 3);
        System.out.println("Static method: "+ distance(a2, a1));
        System.out.println("Point method: "+ a1.distance(a2));

    }
}


