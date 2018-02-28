package Exercise_1;

public class TestCircle {  // Save as "Exercise_1.TestCircle.java"

    public static void main(String[] args) {

        // Declare an instance of Exercise_1.Circle class called c1.
        // Construct the instance c1 by invoking the "default" constructor
        // which sets its radius and color to their default value.

        Circle c1 = new Circle();

        // Invoke public methods on instance c1, via dot operator.

        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());

        // Declare an instance of class circle called c2.
        // Construct the instance c2 by invoking the second constructor
        // with the given radius and default color.

        Circle c2 = new Circle(2.0);

        // Invoke public methods on instance c2, via dot operator.

        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());

        // Modify the test program Exercise_1.TestCircle to construct an instance of Exercise_1.Circle using this constructor.

        // Deklarer c3 som en instance af klassen Exercise_1.Circle og kalder på dens 3 constructor med en radius og color.
        Circle c3 = new Circle(3.0,"blue");

        // Kalder på c3's public methods via dot operator.
        System.out.println("The circle has radius of "
                + c3.getRadius() + " and color " + c3.getColor());

        /*
        * public vs. private: In Exercise_1.TestCircle, can you access the instance variable radius directly (e.g., System.out.println(c1.radius));
        * or assign a new value to radius (e.g., c1.radius=5.0)? Try it out and explain the error messages.
         */

        // System.out.println(c1.radius);

        // Giver error message: Error:(41, 30) java: radius has private access in Exercise_1.Circle
        // Den siger at man ikke kan få adgang til den fordi den har en private access, man ville kunne få adgang til den på den måde hvis den var protected eller public.

        // construct an instance of Exercise_1.Circle
        Circle c4 = new Circle();

        // change radius
        c4.setRadius(5.0);

        // Print radius via getter
        System.out.println("radius is: " + c4.getRadius());

        // Change color
        c4.setColor("black");

        // Print color via getter
        System.out.println("color is: " + c4.getColor());

        Circle c5 = new Circle(5.0);

        System.out.println(c5.toString()); // explicit call
    }
}