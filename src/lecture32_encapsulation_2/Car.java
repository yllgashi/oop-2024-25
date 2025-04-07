package lecture32_encapsulation_2;

public class Car {
    private String engineState;
    private int engineLifetime;

    public void startEngine() {
        this.engineState = "running";
        System.out.println("brr. brr...");
    }

    public void stopEngine() {
        this.engineState = "stopped";
        System.out.println("parked...");
    }
}
