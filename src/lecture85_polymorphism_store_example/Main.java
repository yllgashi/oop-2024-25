package lecture85_polymorphism_store_example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Lenovo", 1000, "Intel", "DDR5", "Ge Force 4080");
        Monitor monitor1 = new Monitor("AOC", 250, "Full HD", 120, "IPS");
        Table table1 = new Table("SENSE7", 250, 70, 120);


        ArrayList<Product> productsOfStore = new ArrayList<>();
        productsOfStore.add(laptop1);
        productsOfStore.add(monitor1);
        productsOfStore.add(table1);

        for (int i = 0; i < productsOfStore.size(); i++) {
            productsOfStore.get(i).showProductInformation();
            System.out.println("#########################");
        }
    }
}
