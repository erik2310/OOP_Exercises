package Exercise_1;

public class TestSimplifiedCircle {

    public static void main(String[] args) {

        // Laver et SimplifiedCircle objekt ved at kalde på dens constructor.
        SimplifiedCircle circle = new SimplifiedCircle();

        // Sætter circlens radius til 5.0
        circle.setRadius(5.0);

        // Henter cirklens radius og udskriver det
        System.out.println(circle.getRadius());

        // Henter dens areal og udskriver det
        System.out.println(circle.getArea());

        // Henter dens omkreds og udskriver det
        System.out.println(circle.getCircumference());

        // Udskriver SimplifiedCircles toString
        System.out.println(circle.toString());

    }

}
