package lecture68_composition_hr_system;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Simulate a database
        HrSystemDatabase database = new HrSystemDatabase();


        // Countries
        Country kosova = new Country(1, "Kosova");

        // add data to database
        database.countriesTable.add(kosova);


        // Cities
        City prishtina = new City(1, "Prishtina");
        City ferizaj = new City(2, "Ferizaj");

        // add data to database
        database.citiesTable.add(prishtina);
        database.citiesTable.add(ferizaj);


        // Departments
        Department softwareDepartment = new Department(1, "Software Department", "Integrate business processes into systems");
        Department itDepartment = new Department(2, "IT & Hardware Department", "Create necessary network infrastructure");

        // add data to database
        database.departmentsTable.add(softwareDepartment);
        database.departmentsTable.add(itDepartment);


        // Jobs
        Job backendDeveloperJob = new Job(1, "BackEnd Developer", "Work with Java and SQL Server");
        Job frontEndDeveloperJob = new Job(2, "FrontEnd Developer", "Work with Angular/React/VueJS/JavaScript");
        Job devOpsJob = new Job(3, "DevOps", "Publish applications infrastructure");

        // add data to database
        database.jobsTable.add(backendDeveloperJob);
        database.jobsTable.add(frontEndDeveloperJob);
        database.jobsTable.add(devOpsJob);


        // Employees
        ArrayList<Job> employee1Jobs = new ArrayList<>();
        employee1Jobs.add(backendDeveloperJob);
        Employee employee1 = new Employee(1, "Filan", "Fisteku", 500, kosova, prishtina, softwareDepartment, employee1Jobs);

        ArrayList<Job> employee2Jobs = new ArrayList<>();
        employee2Jobs.add(frontEndDeveloperJob);
        employee2Jobs.add(backendDeveloperJob);
        Employee employee2 = new Employee(2, "Arian", "Aliu", 800, kosova, prishtina, softwareDepartment, employee2Jobs);

        ArrayList<Job> employee3Jobs = new ArrayList<>();
        employee1Jobs.add(devOpsJob);
        Employee employee3 = new Employee(3, "Eris", "Uruqi", 800, kosova, ferizaj, itDepartment, employee3Jobs);

        // add data to database
        database.employeesTable.add(employee1);
        database.employeesTable.add(employee2);
        database.employeesTable.add(employee3);


        // read data of employee with ID 2
        showOneEmployeeInformation(database, 2);
    }

    public static void showOneEmployeeInformation(HrSystemDatabase database, int employeeId) {
        for (int i = 0; i < database.employeesTable.size(); i++) {
            if (database.employeesTable.get(i).getId() == employeeId) {
                Employee employee = database.employeesTable.get(i);
                System.out.println("ID: " +employee.getId());
                System.out.println("First name: " +employee.getFirstName());
                System.out.println("Last name: " +employee.getLastName());
                System.out.println("Salary: " +employee.getSalary());
                System.out.println("Country: " +employee.getCountry().getName());
                System.out.println("City: " +employee.getCity().getName());
                System.out.println("Department: " +employee.getDepartment().getName());
                for (int j = 0; j < employee.getJobs().size(); j ++) {
                    System.out.println("Job: " +employee.getJobs().get(j).getName());
                }
                break;
            }
        }
    }
}
