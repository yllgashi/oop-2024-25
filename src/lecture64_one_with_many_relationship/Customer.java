package lecture64_one_with_many_relationship;

import java.util.ArrayList;

public class Customer {
    public String firstName;
    public String lastName;
    public ArrayList<Order> orders; // one with many

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = new ArrayList<Order>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }
}
