package lecture64_one_with_many_relationship;

public class Order {
    public String productName;
    public double price;

    public Order(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}
