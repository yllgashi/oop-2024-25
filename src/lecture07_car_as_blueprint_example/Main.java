package lecture07_car_as_blueprint_example;

public class Main {
    public static void main(String[] args) {
        // create objects
        Vehicle object1 = new Vehicle();
        object1.id = 1;
        object1.color = "Blue";
        object1.seats = 2;
        object1.manufacture = "BMW";
        object1.model = "X1";
        object1.year = 2017;

        Vehicle object2 = new Vehicle();
        object2.id = 2;
        object2.color = "Black";
        object2.power = 330;
        object2.seats = 14;
        object2.manufacture = "Mercedes";
        object2.model = "Bus";
        object2.year = 2015;

        Vehicle object3 = new Vehicle();
        object3.id = 3;
        object3.color = "Purple";
        object3.power = 260;
        object3.seats = 5;
        object3.manufacture = "Audi";
        object3.model = "A6";
        object3.year = 2020;


        // show data
//        System.out.println("id: " + object1.id);
//        System.out.println("color: " + object1.color);
//        System.out.println("seats: " + object1.seats);
//        System.out.println("manufacture: " + object1.manufacture);
//        System.out.println("model: " + object1.model);
//        System.out.println("year: " + object1.year);


        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = object1;
        vehicles[1] = object2;
        vehicles[2] = object3;

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("###############");
            System.out.println("Vehicle " + i);
            System.out.println("id: " + vehicles[i].id);
            System.out.println("color: " + vehicles[i].color);
            System.out.println("seats: " + vehicles[i].seats);
            System.out.println("manufacture: " + vehicles[i].manufacture);
            System.out.println("model: " + vehicles[i].model);
            System.out.println("year: " + vehicles[i].year);
        }
    }
}
