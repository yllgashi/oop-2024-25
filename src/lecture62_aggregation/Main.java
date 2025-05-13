package lecture62_aggregation;

public class Main {
    public static void main(String[] args) {
        // Both passenger1 and car1 can live without each other

        Passenger passenger1 = new Passenger();
        passenger1.firstName = "Filan";
        passenger1.lastName = "Fisteku";

        Car car1 = new Car();
        car1.producer = "BMW";
        car1.model = "M3";
        car1.year = 2010;
        car1.passenger = passenger1; // aggregation
    }
}
