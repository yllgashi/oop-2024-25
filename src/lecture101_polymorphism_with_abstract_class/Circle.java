package lecture101_polymorphism_with_abstract_class;

public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(" _ ");
        System.out.println("/");
        System.out.println("  \\");
        System.out.println("-");
    }
}
