package lecture85_polymorphism_store_example;

public class Table extends Product {
    public double height;
    public double width;


    public Table(String name, double price, double height, double width) {
        super(name, price);
        this.height = height;
        this.width = width;
    }

    @Override
    public void showProductInformation() {
        // System.out.println("Name: " + this.name);
        // System.out.println("Price: " + this.price);
        super.showProductInformation();
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
    }
}
