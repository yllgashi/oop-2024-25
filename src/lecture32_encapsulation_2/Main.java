package lecture32_encapsulation_2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        // car1.engineState = "test";
        // car1.engineLifetime = 100;
        car1.startEngine();
        car1.stopEngine();
    }
}
