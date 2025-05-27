package lecture71_inheritance_hierarchy;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.id = 1; // attribute from Animal
        cat.name = "Mace Roki"; // attribute from Animal
        cat.showAnimalInformation(); // method from Animal
        cat.handsNumber = 0; // attribute from GroundAnimal
        cat.legsNumber = 4; // attribute from GroundAnimal
        cat.noseNumber = 1; // attribute from GroundAnimal
        cat.showGroundAnimalInformation(); // method from GroundAnimal
        cat.speak(); // method of Cat


        Dog dog = new Dog();
        dog.id = 2; // attribute from Animal
        dog.name = "Qeni Reksi"; // attribute from Animal
        dog.showAnimalInformation(); // method from Animal
        dog.handsNumber = 0; // attribute from GroundAnimal
        dog.legsNumber = 4; // attribute from GroundAnimal
        dog.noseNumber = 2; // attribute from GroundAnimal
        dog.showGroundAnimalInformation(); // method from GroundAnimal
        dog.speak(); // method of Dog
    }
}
