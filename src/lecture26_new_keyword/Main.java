package lecture26_new_keyword;

public class Main {
    public static void main(String[] args) {
        // new => it allocates a space in memory to save this object "p1" of Person
        Person p1 = new Person();
        p1.getFirstName(); // we are accessing new object's attributes with "."

        // new => still allocates a space in memory even though we are not saving in a variable
        new Person();
        // .getFirstName(); // we only allocated memory but we don't have pointer to access it

    }
}
