package lecture19_online_shopping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        Customer[] customers = new Customer[1];

        // register products
        Product product1 = new Product();
        product1.setId(1);
        product1.setTitle("Laptop LENOVO i7");
        product1.setDescription("Laptop i mire");
        product1.setCategory("Laptop");
        products[0] = product1; // add product1 in list to show

        Product product2 = new Product();
        product2.setId(2);
        product2.setTitle("Laptop MACBOOK M2");
        product2.setDescription("Laptop shume i mire");
        product2.setCategory("Laptop");
        products[1] = product2;  // add product2 in list to show

        Product product3 = new Product();
        product3.setId(3);
        product3.setTitle("Samsung S24 Ultra");
        product3.setDescription("Telefon shume i mire");
        product3.setCategory("Telefon");
        products[2] = product3;  // add product2 in list to show


        // register one customer
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Filan");
        customer1.setLastName("Fisteku");
        customer1.setAddress("Prishtine, Dragodan...");
        customers[0] = customer1; // add customer1 in list to show


        // UI
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Shfaq produktet");
        System.out.println("2. Shfaq konsumatoret");
        System.out.println("3. Shfaq produktet ne baze te kategorise 'Laptop'");
        System.out.println("4. Shfaq produktet ne baze te kategorise 'Telefon'");
        System.out.print("Write option:");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                // shfaq produktet
                showProducts(products);
                break;
            case 2:
                // shfaq konsumatoret
                showCustomers(customers);
                break;
            case 3:
                // shfaq produktet laptop
                showProductsBasedOnCategory(products, "Laptop");
                break;
            case 4:
                // shfaq produktet telefon
                showProductsBasedOnCategory(products, "Telefon");
                break;
            default:
                System.out.println("Not valid option");
        }
    }

    public static void showProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println("#################");
            System.out.println("Id: " + products[i].getId());
            System.out.println("Title: " + products[i].getTitle());
            System.out.println("Category: " + products[i].getCategory());
            System.out.println("Description: " + products[i].getDescription());
        }
    }

    public static void showCustomers(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            System.out.println("#################");
            System.out.println("Id: " + customers[i].getId());
            System.out.println("FirstName: " + customers[i].getFirstName());
            System.out.println("LastName: " + customers[i].getLastName());
            System.out.println("Address: " + customers[i].getAddress());
        }
    }

    public static void showProductsBasedOnCategory(Product[] products, String category) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getCategory().equals(category)) {
                System.out.println("#################");
                System.out.println("Id: " + products[i].getId());
                System.out.println("Title: " + products[i].getTitle());
                System.out.println("Category: " + products[i].getCategory());
                System.out.println("Description: " + products[i].getDescription());
            }
        }
    }
}
