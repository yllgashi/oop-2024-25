package lecture86_polymorphism_payroll_example;

public class Professor extends Employee {
    private int hoursTaken;
    private int hourPrice;

    public Professor(int id, String firstName, String lastName, int hoursTaken, int hourPrice) {
        super(id, firstName, lastName);
        this.setHourPrice(hourPrice);
        this.setHoursTaken(hoursTaken);
    }

    public int getHoursTaken() {
        return hoursTaken;
    }

    public void setHoursTaken(int hoursTaken) {
        this.hoursTaken = hoursTaken;
    }

    public int getHourPrice() {
        return hourPrice;
    }

    public void setHourPrice(int hourPrice) {
        this.hourPrice = hourPrice;
    }

    @Override
    public void pay() {
        System.out.println("Total salary is: " + this.getHoursTaken() * this.getHourPrice());
    }
}
