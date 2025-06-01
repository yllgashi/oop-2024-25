package lecture85_polymorphism_store_example;

public class Monitor extends Product {
    public String resolution;
    public int refreshRate;
    public String type;


    public Monitor(String name, double price, String resolution, int refreshRate, String type) {
        super(name, price);
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.type = type;
    }

    @Override
    public void showProductInformation() {
        // System.out.println("Name: " + this.name);
        // System.out.println("Price: " + this.price);
        super.showProductInformation();
        System.out.println("Resolution: " + this.resolution);
        System.out.println("Type: " + this.type);
    }
}
