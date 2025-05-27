package lecture68_composition_hr_system;

import java.util.ArrayList;

public class Employee {
    // attributes
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private Country country;
    private City city;
    private Department department;
    private ArrayList<Job> jobs; // one employee can have more than one job in the same company


    // constructors
    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, double salary, Country country, City city, Department department, ArrayList<Job> jobs) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSalary(salary);
        this.setCountry(country);
        this.setCity(city);
        this.setDepartment(department);
        this.setJobs(jobs);
    }


    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
}
