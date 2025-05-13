package lecture64_one_with_many_relationship;

public class Main {
    public static void main(String[] args) {
        // one customer with many orders
        Customer customer1 = new Customer("Filan", "Fisteku");

        Order order1 = new Order("HyperX Cloud 3", 99.50);
        customer1.addOrder(order1);

        Order order2 = new Order("Maus Logitech G Pro X", 129.50);
        customer1.addOrder(order2);

        Order order3 = new Order("Tavoline Elektrike", 50);
        customer1.addOrder(order3);


        // print
        System.out.println("Customer1 information");
        System.out.println("FirstName: " + customer1.firstName);
        System.out.println("LastName: " + customer1.lastName);
        System.out.println("Orders of customer1: ");
        for (int i = 0; i < customer1.orders.size(); i++) {
            System.out.println("ProductName: " + customer1.orders.get(i).productName);
            System.out.println("ProductPrice: " + customer1.orders.get(i).price);
        }
    }
}
