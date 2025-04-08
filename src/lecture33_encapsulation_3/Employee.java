package lecture33_encapsulation_3;

public class Employee {
    private String firstName;
    private String lastName;
    private double hoursOfWork;
    private double hourPrice;
    private String personalId;
    private String eyeColor;
    private double height;
    private String imageUrl;
    private String hairColor;

    public void setFullName(String firstName1, String lastName1) {
        this.firstName = firstName1;
        this.lastName = lastName1;
    }

    public void setSalaryInformation(double hoursOfWork1, double hourPrice1) {
        this.hoursOfWork = hoursOfWork1;
        this.hourPrice = hourPrice1;
    }

    public double generateSalary() {
        return this.hourPrice * this.hoursOfWork;
    }
}
