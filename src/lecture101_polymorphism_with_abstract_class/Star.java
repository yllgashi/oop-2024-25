package lecture101_polymorphism_with_abstract_class;

public class Star extends Shape {
    @Override
    public void draw() {
        System.out.println(" /\\ ");
        System.out.println("/");
        System.out.println("  \\");
        System.out.println("-");
    }
}
