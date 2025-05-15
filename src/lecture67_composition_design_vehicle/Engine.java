package lecture67_composition_design_vehicle;

public class Engine {
    private int id;
    private String name;
    private String fuel;
    private double volume;

    public Engine() {
    }

    public Engine(int id, String name, String fuel, double volume) {
        this.setId(id);
        this.setName(name);
        this.setFuel(fuel);
        this.setVolume(volume);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
