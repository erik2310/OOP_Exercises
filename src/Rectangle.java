public class Rectangle {

    // Laver klassens attributes

    // Deklarer float datatyper
    private float length = 1.0f;
    private float width = 1.0f;

    // Laver klassens metoder

    // Default no-arg constructor
    public Rectangle() {
    }

    // En constructor der tager lenght og width som argument
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    // En metode der returner length
    public float getLength() {
        return length;
    }

    // En metode til at sætte length
    public void setLength(float length) {
        this.length = length;
    }

    // En metode der returner width
    public float getWidth() {
        return width;
    }

    // En metode til at sætte width
    public void setWidth(float width) {
        this.width = width;
    }

    // En metode der regner rektanglens areal
    public double getArea() {
        return length * width;
    }

    // En metode der regner rektanglens omkreds
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Returnerer klassens datatyper som en String
    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
