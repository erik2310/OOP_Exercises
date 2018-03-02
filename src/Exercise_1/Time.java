package Exercise_1;

public class Time {

    // Laver klassens attributes

    // Deklarer dens datatyper
    private int hour, minute, second;

    // Laver dens metoder

    // En constructor der tager imod hour, minute og secound som arguments
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // En metode der returner hour
    public int getHour() {
        return hour;
    }

    // En metode der sætter hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // En metode der returner minute
    public int getMinute() {
        return minute;
    }

    // En metode der sætter minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // En metode der returner second
    public int getSecond() {
        return second;
    }

    // En metode der sætter second
    public void setSecond(int second) {
        this.second = second;
    }

    // En metode der sætter hour, minute og second
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Returnerer klassens datatyper som en String
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    // Mangler nextSecond() og previousSecond

}
