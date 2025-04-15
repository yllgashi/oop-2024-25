package lecture42_class_modeling;

public class Food {
    // attributes
    private int id;
    private String name;
    private double price;


    // constructors
    public Food() {
    }


    public Food(int id, String name, double price) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }


    // properties
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    // behaviours
    public void showInformation() {
        System.out.println("Food with ID: " + this.getId() + ", name: " + this.getName() + ", price: " + this.getPrice());
    }
}
