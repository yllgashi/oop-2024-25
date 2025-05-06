package lecture54_exercises;

public class Rectangle {
    // attributes
    private int a;
    private int b;

    // constructors
    public Rectangle(int a, int b) {
        this.setA(a);
        this.setB(b);
    }

    // properties
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    // methods
    public double getPerimeter() {
        // double perimeter = this.getA() + this.getB() + this.getA() + this.getB();
        double perimeter = (2 * getA()) + (2 * getB());
        return perimeter;
    }

    public double getSyprine() {
        double syprine = this.getA() * this.getB();
        return syprine;
    }

    public boolean isEqualWith(Rectangle anotherRectangle) {
        double rec1Perimeter = this.getPerimeter();
        double rec2Perimeters = anotherRectangle.getPerimeter();

        if (rec1Perimeter == rec2Perimeters) {
            return true;
        } else {
            return false;
        }
    }
}
