package lecture06_restaurant_classes;

import java.util.Scanner;

public class ApplicationObjects {
    public static void main(String[] args) {
        // initialize objects of: Waiter, Menu, Customer, Chef

        // two waiters
        Waiter waiter1 = new Waiter();
        waiter1.id = 1;
        waiter1.firstName = "Filan";
        waiter1.lastName = "Fisteku";
        waiter1.schedule = "08:00-17:00";
        waiter1.salary = 100.00;

        Waiter waiter2 = new Waiter();
        waiter2.id = 2;
        waiter2.firstName = "Agon";
        waiter2.lastName = "Gashi";
        waiter2.schedule = "17:00-00:00";
        waiter2.salary = 150.00;

        // one chef
        Chef chef1 = new Chef();
        chef1.id = 1;
        chef1.firstName = "Malcolm";
        chef1.lastName = "Taylor";
        chef1.schedule = "10:00-18:00";

        // one menu
        Menu menu = new Menu();
        menu.foods = new String[]{"Food1", "Food2"};
        menu.foodPrices = new double[]{1.50, 2.30};
        menu.drinks = new String[]{"Drink1", "Drink2"};
        menu.drinkPrices = new double[]{1.50, 2.00};

        // two customers
        Customer customer1 = new Customer();
        customer1.firstName = "Mark";
        customer1.lastName = "Potter";

        Customer customer2 = new Customer();
        customer2.firstName = "Yusef";
        customer2.lastName = "Wallis";


        // #################################################
        // #################################################
        // #################################################
        System.out.println("Welcome to my restaurant");
        System.out.println("1 - Show all waiters");
        System.out.println("2 - Show all chefs");
        System.out.println("3 - Show all customers");
        System.out.println("4 - Show menu");
        System.out.println("0 - Quit");

        Scanner scanner = new Scanner(System.in);
        int userInput = -1;

        while (userInput != 0) {
            System.out.print("Option: ");
            userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println(waiter1.firstName + " " + waiter1.lastName + " / " + waiter1.schedule);
                    System.out.println(waiter2.firstName + " " + waiter2.lastName + " / " + waiter2.schedule);
                    break;
                case 2:
                    System.out.println(chef1.firstName + " " + chef1.lastName + " / " + chef1.schedule);
                    break;
                case 3:
                    System.out.println(customer1.firstName + " " + customer1.lastName);
                    System.out.println(customer2.firstName + " " + customer2.lastName);
                    break;
                case 4:
                    for (int i = 0; i < menu.foods.length; i++) {
                        System.out.println(menu.foods[i] + " - " + menu.foodPrices[i] + "euro");
                    }
                    for (int i = 0; i < menu.drinks.length; i++) {
                        System.out.println(menu.drinks[i] + " - " + menu.drinkPrices[i] + "euro");
                    }
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }
        System.out.println("Application terminated");
    }
}
