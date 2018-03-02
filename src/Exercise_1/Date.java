package Exercise_1;

public class Date {

    // Laver klassens attributes

    // Deklarer dens datatyper
    private int day, month, year;

    // Laver dens metoder

    // En constructor der tager imod day, month, year som arguments
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // En metode der returner day
    public int getDay() {
        return day;
    }

    // En metode der sætter day
    public void setDay(int day) {
        this.day = day;
    }

    // En metode der returner month
    public int getMonth() {
        return month;
    }

    // En metode der sætter month
    public void setMonth(int month) {
        this.month = month;
    }

    // En metode der returner year
    public int getYear() {
        return year;
    }

    // En metode der sætter year
    public void setYear(int year) {
        this.year = year;
    }

    // En metode der sætter day, month og year
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Returnerer klassens datatyper som en String
    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}
