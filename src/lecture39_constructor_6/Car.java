package lecture39_constructor_6;

public class Car {
    // attributes
    private String brand;
    private String model;

    // constructors

    public Car() {
        
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // properties
    // ...
}
