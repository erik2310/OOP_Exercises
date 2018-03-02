package Exercise_1;

public class TestTime {

    public static void main(String[] args) {

        // Laver et Time objekt ved at kalde på dens constructor.
        Time time = new Time(0, 33, 27);

        // Sætter dens hour
        time.setHour(1);

        // Henter dens hour og udskriver den
        System.out.println(time.getHour());

        // Sætter dens minute
        time.setMinute(40);

        // Henter dens minute og udskriver den
        System.out.println(time.getMinute());

        // Sætter dens second
        time.setSecond(30);

        // Henter dens second og udskriver den
        System.out.println(time.getSecond());

        // Sætter dens hour, minute og second
        time.setTime(0, 33, 27);

        // Udskriver Times toString
        System.out.println(time.toString());

    }

}
