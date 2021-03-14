package classwork;

public class Circle {
    private int radius, x, y;

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    public void increaseRadiusBy(int radius) {
        this.radius += radius;
    }

    public static void main(String[] args) {
        Circle[] circs = new Circle[3];
        circs[2] = new Circle(5, 2, 7);
        circs[1] = new Circle(8, 0, 0);

        Circle circleA = circs[1];
        double area = circs[2].getArea();
        circs[1].increaseRadiusBy(6);
    }
}
