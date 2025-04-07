package lecture31_encapsulation_1;

public class Main {
    public static void main(String[] args) {
        DateWithNoLimitedAccess date1 = new DateWithNoLimitedAccess();
        date1.day = 50;
        date1.month = 13;
        date1.year = -10;
        System.out.println("Date: " + date1.year + '-' + date1.month + '-' + date1.day);

        DateWithLimitedAccess date2 = new DateWithLimitedAccess();
        date2.setDay(31);
        date2.setMonth(12);
        date2.setYear(-10);
        System.out.println("Date: " + date2.getYear() + '-' + date2.getMonth() + '-' + date2.getDay());
    }
}
