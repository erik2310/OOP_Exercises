package Exercise_1;

public class TestRectangle {

    public static void main(String[] args) {

        // Laver et Rectangle objekt ved at kalde på dens constructor.
        Rectangle rectangle = new Rectangle();

        // Sætter dens length
        rectangle.setLength(5);

        // Henter dens length og udskriver den
        System.out.println(rectangle.getLength());

        // Sætter dens width
        rectangle.setWidth(5);

        // Henter dens width og udskriver den
        System.out.println(rectangle.getWidth());

        // Henter dens areal og udskriver den
        System.out.println(rectangle.getArea());

        // Henter dens omkreds og udskriver den
        System.out.println(rectangle.getPerimeter());

        // Udskriver Rectangles toString
        System.out.println(rectangle.toString());

    }

}
