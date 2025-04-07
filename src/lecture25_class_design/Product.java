package lecture25_class_design; // folder name (in which class is created and belongs to)

// "Order" class belongs to another folder (package). So inorder to use it, we need to import this class from that package
import lecture24_restaurant_system_from_use_case_diagram.Order;
import lecture11_1_merrjep.House;


public class Product {
    public static void main(String[] args) {
        Order order = new Order();
        House house1 = new House();
    }
}
