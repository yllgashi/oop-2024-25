package lecture24_restaurant_system_from_use_case_diagram;

public class Administrator {
    // attributes
    private int id;
    private String firstName;
    private String lastName;


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

    // methods
    public void showOrders(Order[] orders) {
        System.out.println("*********** ORDERS ***********");
        for (int i = 0; i < orders.length; i++) {
            System.out.println("##############################");
            System.out.println("Order ID: " + orders[i].getId());
            System.out.println("Product: " + orders[i].getProductName());
            System.out.println("Quantity: " + orders[i].getQuantity());
            System.out.println("Price: " + orders[i].getPrice());
            System.out.println("Date: " + orders[i].getDate());
        }
    }
}
