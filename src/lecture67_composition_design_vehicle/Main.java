package lecture67_composition_design_vehicle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(1, "2.0 TDI", "Diesel", 2000);
        ArrayList<Wheel> wheels = new ArrayList<>();
        wheels.add(new Wheel(1, "Black", 18));
        wheels.add(new Wheel(2, "Black", 18));
        wheels.add(new Wheel(3, "Black", 18));
        wheels.add(new Wheel(4, "Black", 18));

        Vehicle vehicle1 = new Vehicle(1, "VW", "Golf 7", engine1, wheels);


        System.out.println("Print Vehicle 1 information");
        System.out.println(vehicle1.getId());
        System.out.println(vehicle1.getProducer());
        System.out.println(vehicle1.getModel());
        System.out.println(vehicle1.getEngine().getId());
        System.out.println(vehicle1.getEngine().getName());
        System.out.println(vehicle1.getEngine().getFuel());
        System.out.println(vehicle1.getEngine().getVolume());
        for (int i = 0; i < vehicle1.getWheels().size(); i++) {
            System.out.println("Wheel " + (i + 1));
            System.out.println(vehicle1.getWheels().get(i).getId());
            System.out.println(vehicle1.getWheels().get(i).getColor());
            System.out.println(vehicle1.getWheels().get(i).getSize());
        }
    }
}
