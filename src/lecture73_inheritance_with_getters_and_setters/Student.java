package lecture73_inheritance_with_getters_and_setters;

public class Student extends Person{
    private double averageGrade;

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
