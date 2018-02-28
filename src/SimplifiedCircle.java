public class SimplifiedCircle {

    // Laver klassens attributes

    // Deklarer radius som en double datatype
    private double radius = 1.0;

    // Laver klassens metoder

    // Default no-arg constructor
    public SimplifiedCircle() {
    }

    // En constructor der tager radius som argument
    public SimplifiedCircle(double radius) {
        this.radius = radius;
    }

    // En metode der returner radius
    public double getRadius() {
        return radius;
    }

    // En metode til at sætte radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // En metode der regner cirklens areal
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // En metode der regner cirklens omkreds
    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    // Returnerer klassens datatyper som en String
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
