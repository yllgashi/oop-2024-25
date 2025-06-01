package lecture85_polymorphism_store_example;

public class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showProductInformation() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
    }
}
