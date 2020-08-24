import java.util.Arrays;

public class Circle {
    private double radius, coordinate[];

    public double getRadius() {
        return radius;
    }

    public double[] getCoordinate() {
        return coordinate;
    }

    public Circle() {
        this.radius = 1;
        coordinate[0] = 0;
        coordinate[1] = 0;
    }

    public Circle(double radius) {
        this.radius = radius;
        coordinate[0] = 0;
        coordinate[1] = 0;
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        coordinate[0] = x;
        coordinate[1] = y;
    }

    public String toString() {
        return String.format("Radius = %f \nCoordinates = (%.2f, %.2f)", radius, coordinate[0], coordinate[1]);
    }

    public boolean equals(Circle c) {
      	return (this.radius == c.getRadius()) && (Arrays.equals(this.coordinate, c.getCoordinate()));
    }
}