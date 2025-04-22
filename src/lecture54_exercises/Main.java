package lecture54_exercises;

public class Main {
    public static void main(String[] args) {
        // 1
        Point p1 = new Point(2, 3);
        System.out.println("p1 => {" + p1.getX() + ", " + p1.getY() + "}");

        Point p2 = new Point(4, 5);
        System.out.println("p2 => {" + p2.getX() + ", " + p2.getY() + "}");

        // calculate distance
        double distanceBetweenP1AndP2 = p1.findDistance(p2);
        System.out.println(distanceBetweenP1AndP2);





        // 2
        Square square1 = new Square(10);
        double square1Perimeter = square1.calculatePerimeter();
        double square1Syprine = square1.calculateSyprine();

        System.out.println("One side of square has total length of: " + square1.getA() + "m");
        System.out.println("Perimeter of square: " + square1Perimeter);
        System.out.println("Syprine of square: " + square1Syprine);
        square1.draw();


        Square square2 = new Square(20);
        boolean isSquareOneBiggerThanSquareTwo = square1.isGreaterThan(square2);
        System.out.println(isSquareOneBiggerThanSquareTwo);
    }
}
