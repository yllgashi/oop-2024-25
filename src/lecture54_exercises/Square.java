package lecture54_exercises;

public class Square {
    private int a;

    public Square() {
    }

    public Square(int a) {
        this.setA(a);
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double calculatePerimeter() {
        // P = 4a;
        return 4 * this.getA();
    }

    public double calculateSyprine() {
        // S = a^2
        return this.getA() * this.getA();
    }

    public void draw() {
        System.out.println("--");
        System.out.println("|  |");
        System.out.println("--");
    }

    public boolean isGreaterThan(Square anotherSquare) {
        double squareOne = this.calculatePerimeter();
        double sqaureTwo = anotherSquare.calculatePerimeter();
        return squareOne > sqaureTwo;
    }
}
