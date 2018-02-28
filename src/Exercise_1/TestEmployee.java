package Exercise_1;

public class TestEmployee {

    public static void main(String[] args) {

        // Laver et Employee objekt ved at kalde på dens constructor med arguments id, salary, firstName og lastName.
        Employee employee = new Employee(1, 1000, "Erik", "Ruhmanis");

        // Henter dens id og udskriver den
        System.out.println(employee.getID());

        // Henter dens firstName og udskriver den
        System.out.println(employee.getFirstName());

        // Henter dens lastName og udskriver den
        System.out.println(employee.getLastName());

        // Henter dens fornavn og efternavn, udskriver den
        System.out.println(employee.getName());

        // Sætter salary til 2000
        employee.setSalary(2000);

        // Henter dens salary og udskriver den
        System.out.println(employee.getSalary());

        // Henter dens salary ganget med 12 og udskriver den
        System.out.println(employee.getAnnualSalary());

        // Øger salary med 10 procent og udskriver den
        System.out.println(employee.raiseSalary(10));

        // Udskriver Employee toString
        System.out.println(employee.toString());

    }

}
