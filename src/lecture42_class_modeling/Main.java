package lecture42_class_modeling;

public class Main {
    public static void main(String[] args) {
        Waiter waiter1 = new Waiter(1, "Filan", "Fisteku", "08:00-16:00");
        Waiter waiter2 = new Waiter(2, "Ibrahim", "Tatlises", "16:00-23:00");

        waiter1.serveFood("Hamburger", 2);
        waiter2.serveFood("Pizza", 5);


        Food food1 = new Food(1, "Hamburger", 2.00);
        Food food2 = new Food(2, "Pizza", 5.50);

        food1.showInformation();
        food2.showInformation();
    }
}
