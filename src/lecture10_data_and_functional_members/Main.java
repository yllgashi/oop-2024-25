package lecture10_data_and_functional_members;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.type = "Margarita";
        pizza1.size = 'M';
        pizza1.price = 3.50;
        pizza1.ingredients = new String[]{"Flour"};

        Pizza pizza2 = new Pizza();
        pizza2.type = "Pepperoni";
        pizza2.size = 'L';
        pizza2.price = 4.50;
        pizza2.ingredients = new String[]{"Flour", "Pepperoni"};

        System.out.println("Show menu:");
        // Pizza one:
        System.out.println(pizza1.type);
        System.out.println(pizza1.size);
        System.out.println(pizza1.price);
        for (int i = 0; i < pizza1.ingredients.length; i++) {
            System.out.println(pizza1.ingredients[i] + ", ");
        }


        // Pizza two:
        System.out.println(pizza2.type);
        System.out.println(pizza2.size);
        System.out.println(pizza2.price);
        for (int i = 0; i < pizza2.ingredients.length; i++) {
            System.out.println(pizza2.ingredients[i] + ", ");
        }
    }
}
