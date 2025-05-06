package lecture54_exercises;

public class Main {
    public static void main(String[] args) {
        // 1
        System.out.println("********* Point *********");
        Point p1 = new Point(2, 3);
        System.out.println("p1 => {" + p1.getX() + ", " + p1.getY() + "}");

        Point p2 = new Point(4, 5);
        System.out.println("p2 => {" + p2.getX() + ", " + p2.getY() + "}");

        // calculate distance
        double distanceBetweenP1AndP2 = p1.findDistance(p2);
        System.out.println(distanceBetweenP1AndP2);


        // 2
        System.out.println("********* Square *********");
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


        // 3
        System.out.println("********* Rectangle *********");
        Rectangle rectangle1 = new Rectangle(5, 10);
        Rectangle rectangle2 = new Rectangle(10, 15);
        System.out.println("a:" + rectangle1.getA());
        System.out.println("b:" + rectangle1.getB());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Syprine: " + rectangle1.getSyprine());

        boolean areEquals = rectangle1.isEqualWith(rectangle2);
        System.out.println("Are equal with another rectangle? " + areEquals);

















        double rectangle1Perimeter = rectangle1.getPerimeter();
        double rectangle2Perimeter = rectangle2.getPerimeter();

        if (rectangle1Perimeter > rectangle2Perimeter) {
            System.out.println("Rectangle 1 is greater than rectangle 2");
        }



        // testing
//        if ("abc" == "def") {
//            System.out.println("is greater than");
//        }
//
//        if ("abc".equals("def")) {
//
//        }
    }
}
