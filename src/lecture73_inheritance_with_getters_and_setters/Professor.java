package lecture73_inheritance_with_getters_and_setters;

public class Professor extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
