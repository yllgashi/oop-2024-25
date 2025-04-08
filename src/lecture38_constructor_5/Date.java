package lecture38_constructor_5;

public class Date {
    // attributes
    private int year;
    private int month;
    private int day;

    // constructor
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getFullDate() {
        return this.year + "-" + this.month + "-" + this.day;
    }
}
