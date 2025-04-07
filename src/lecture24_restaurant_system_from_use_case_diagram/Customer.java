package lecture24_restaurant_system_from_use_case_diagram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Customer {
    // attributes
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate registrationDate;


    // properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    // methods
    public Order orderProduct() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String productName = scanner.nextLine();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("ID: ");
        int id = scanner.nextInt();

        Order order = new Order();
        order.setId(id);
        order.setDate(LocalDateTime.now());
        order.setProductName(productName);
        order.setQuantity(quantity);
        order.setPrice(price);

        return order;
    }
}
