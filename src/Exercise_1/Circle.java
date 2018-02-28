package Exercise_1;

/*
 * The Exercise_1.Circle class models a circle with a radius and color.
 */
public class Circle {  // Save as "Exercise_1.Circle.java"
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // The default constructor with no argument.
    // It sets the radius and color to their default value.
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // 2nd constructor with given radius, but color default
    public Circle(double r) {
        this.radius = r;
        this.color = "red";
    }

    // 3rd constructor to construct a new instance of Exercise_1.Circle with the given radius and color
    public Circle (double r, String c) {
        this.radius = r;
        this.color = c;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for retrieving the color
    public String getColor() {
        return color;
    }

    // A public method for computing the area of circle
    public double getArea() {
        return radius*radius*Math.PI;
    }

    // Setter for instance variable radius
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    // Setter for instance variable color
    public void setColor(String newColor) {
        this.color = newColor;
    }

    // Return a description of this instance in the form of
    // Exercise_1.Circle[radius=r,color=c]
    public String toString() {
        return "Exercise_1.Circle[radius=" + radius + " color=" + color + "]";
    }
}