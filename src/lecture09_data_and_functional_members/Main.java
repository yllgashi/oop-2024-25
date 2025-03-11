package lecture09_data_and_functional_members;

public class Main {
    public static void main(String[] args) {
        // create object of Vehicle type (class)
        Vehicle object1 = new Vehicle();

        // initialize data members
        object1.id = 1;
        object1.color = "Blue";
        object1.seats = 2;
        object1.manufacture = "BMW";
        object1.model = "X1";
        object1.year = 2017;

        // show behaviours
        object1.startEngine();
        object1.drive();

        // after two years has gone
        object1.changeOil();
    }
}
