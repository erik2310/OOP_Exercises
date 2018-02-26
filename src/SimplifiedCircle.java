public class SimplifiedCircle {

    // Laver klassens attributes

    private double radius = 1.0;

    // Laver klassens metoder

    public SimplifiedCircle() {
    }

    public SimplifiedCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
