package lecture68_composition_hr_system;

import java.util.ArrayList;

public class HrSystemDatabase {
    public ArrayList<City> citiesTable;
    public ArrayList<Country> countriesTable;
    public ArrayList<Department> departmentsTable;
    public ArrayList<Employee> employeesTable;
    public ArrayList<Job> jobsTable;

    public HrSystemDatabase() {
        citiesTable = new ArrayList<>();
        countriesTable = new ArrayList<>();
        departmentsTable = new ArrayList<>();
        employeesTable = new ArrayList<>();
        jobsTable = new ArrayList<>();
    }
}
