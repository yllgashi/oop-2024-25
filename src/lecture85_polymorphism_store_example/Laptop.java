package lecture85_polymorphism_store_example;

public class Laptop extends Product {
    public String processorType;
    public String ramType;
    public String graphicCardType;

    public Laptop(String name, double price, String processorType, String ramType, String graphicCardType) {
        super(name, price);
        this.processorType = processorType;
        this.ramType = ramType;
        this.graphicCardType = graphicCardType;
    }

    @Override
    public void showProductInformation() {
        // System.out.println("Name: " + this.name);
        // System.out.println("Price: " + this.price);
        super.showProductInformation();
        System.out.println("Processor Type: " + this.processorType);
        System.out.println("Ram Type: " + this.ramType);
        System.out.println("Graphical Card Type: " + this.graphicCardType);
    }
}
