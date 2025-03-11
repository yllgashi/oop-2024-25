package lecture09_data_and_functional_members;

public class Vehicle {
    // data members

    public int id;
    public String color;
    public int power;
    public short seats;
    public String manufacture;
    public String model;
    public short year;
    public double price;



    // functional (behaviours) members
    public void startEngine() {
        System.out.println("brr brr....");
    }

    public void drive() {
        System.out.println("Vehicle is on driving mode...");
    }

    public void changeOil() {
        System.out.println("Vehicle is checking for oil-change needs...");
    }
}
