package lecture24_restaurant_system_from_use_case_diagram;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        // local database example
        Administrator[] administrators = new Administrator[1];
        Chef[] chefs = new Chef[2];
        Customer[] customers = new Customer[2];
        Order[] orders = new Order[2];

        // create administrator object and store in *database
        Administrator administrator1 = new Administrator();
        administrator1.setId(1);
        administrator1.setFirstName("Filan");
        administrator1.setLastName("Fisteku");
        administrators[0] = administrator1;

        // create chef object and store in *database
        Chef chef1 = new Chef();
        chef1.setId(1);
        chef1.setFirstName("Fatime");
        chef1.setLastName("Bekimi");
        chefs[0] = chef1;

        // create customer object and store in *database
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("Afrim");
        customer1.setLastName("Ramadani");
        customer1.setRegistrationDate(LocalDate.now());
        customers[0] = customer1;


        // create-order use-case
        Order order1 = customers[0].orderProduct();
        orders[0] = order1;

        Order order2 = customers[0].orderProduct();
        orders[1] = order2;


        // confirm orders from chef
        chefs[0].confirmOrder(orders[0]);
        chefs[0].confirmOrder(orders[1]);

        // show all orders as administrator
        administrators[0].showOrders(orders);
    }
}
