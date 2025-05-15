package lecture66_composition_design_computer;

public class Ram {
    private int id;
    private double capacity;
    private double price;


    public Ram() {
    }

    public Ram(int id, double capacity, double price) {
        this.setId(id);
        this.setCapacity(capacity);
        this.setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
