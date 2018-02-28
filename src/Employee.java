public class Employee {

    // Laver klassens attributes

    // Deklarer int og String datatyper
    private int id, salary;
    private String firstName, lastName;

    // Laver klassens metoder

    // En constructor der tager imod id, salary, firstName og lastName arguments
    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // En metode der returner id
    public int getID() {
        return id;
    }

    // En metode der returner firstName
    public String getFirstName() {
        return firstName;
    }

    // En metode der returner lastName
    public String getLastName() {
        return lastName;
    }

    // En metode der returner firstName og lastName
    public String getName() {
        return firstName + " " + lastName;
    }

    // En metode der returner salary
    public int getSalary() {
        return salary;
    }

    // En metode der sætter salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // En metode der returner salary ganget med 12
    public int getAnnualSalary() {
        return salary * 12;
    }

    // En metode der øger salary med et antal procent
    public int raiseSalary(int percent) {
        return salary * (1 + percent / 100);
    }

    // Returnerer klassens datatyper som en String
    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + ']';
    }
}
