public class Employee {

    // Laver klassens attributes

    private int id, salary;
    private String firstName, lastName;

    // Laver klassens metoder

    public Employee(int id, int salary, String firstName, String lastName) {
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return salary * (1 + percent / 100);
    }

    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + ']';
    }
}
