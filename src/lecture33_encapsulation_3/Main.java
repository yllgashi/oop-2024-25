package lecture33_encapsulation_3;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setFullName("Filan", "Fisteku");
        employee.setSalaryInformation(40, 2);
        double generatedSalary = employee.generateSalary();

        System.out.println("Salary of employee: " + generatedSalary);
    }
}
