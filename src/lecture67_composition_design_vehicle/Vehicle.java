package lecture67_composition_design_vehicle;

import java.util.ArrayList;

public class Vehicle {
    private int id;
    private String producer;
    private String model;
    private Engine engine; // one with one
    private ArrayList<Wheel> wheels; // one with many

    public Vehicle() {
    }

    public Vehicle(int id, String producer, String model, Engine engine, ArrayList<Wheel> wheels) {
        this.setId(id);
        this.setProducer(producer);
        this.setModel(model);
        this.setEngine(engine);
        this.setWheels(wheels);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(ArrayList<Wheel> wheels) {
        this.wheels = wheels;
    }
}
