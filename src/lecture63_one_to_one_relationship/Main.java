package lecture63_one_to_one_relationship;

public class Main {
    public static void main(String[] args) {
        // one person one brain

        Brain brain1 = new Brain("red", 8);
        Person person1 = new Person("Filan", "Fisteku", brain1);

        Brain brain2 = new Brain("red", 9.12);
        Person person2 = new Person("Edona", "Veliu", brain2);

    }
}
