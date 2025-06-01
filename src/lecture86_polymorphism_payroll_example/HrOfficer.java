package lecture86_polymorphism_payroll_example;

public class HrOfficer extends Employee {
    private double monthlySalary;

    public HrOfficer(int id, String firstName, String lastName, double monthlySalary) {
        super(id, firstName, lastName);
        this.setMonthlySalary(monthlySalary);
    }


    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void pay() {
        System.out.println("Total salary is: " + this.getMonthlySalary());
    }
}
