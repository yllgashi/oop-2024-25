package lecture86_polymorphism_payroll_example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HrOfficer hrOfficer1 = new HrOfficer(1, "Filan", "Fisteku", 200);
        HrOfficer hrOfficer2 = new HrOfficer(2, "Ramadan", "Gashi", 300);
        Professor professor1 = new Professor(3, "Yll", "Gashi", 20, 5);
        Professor professor2 = new Professor(4, "Naim", "Sulejmani", 15, 5);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(hrOfficer1);
        employees.add(hrOfficer2);
        employees.add(professor1);
        employees.add(professor2);


        // different calculation methodology for professor and HR employees
        // but we make polimorphic call to pay in different methodologies in the same place
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getFirstName());;
            System.out.println(employees.get(i).getLastName());;
            employees.get(i).pay();
            System.out.println("###############");
        }
    }
}
