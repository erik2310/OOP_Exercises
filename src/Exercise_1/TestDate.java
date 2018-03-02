package Exercise_1;

public class TestDate {

    public static void main(String[] args) {

        // Laver et Date objekt ved at kalde på dens constructor.
        Date date = new Date(2, 3, 2018);

        // Sætter dens day
        date.setDay(10);

        // Henter dens day og udskriver den
        System.out.println(date.getDay());

        // Sætter dens month
        date.setMonth(10);

        // Henter dens month og udskriver den
        System.out.println(date.getMonth());

        // Sætter dens year
        date.setYear(2010);

        // Henter dens year og udskriver den
        System.out.println(date.getYear());

        // Sætter dens day, month, year
        date.setDate(2, 3, 2018);

        // Udskriver Dates toString
        System.out.println(date.toString());

    }

}
