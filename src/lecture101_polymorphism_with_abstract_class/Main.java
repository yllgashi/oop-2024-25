package lecture101_polymorphism_with_abstract_class;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square square = new Square();
        Star star = new Star();
        Circle circle = new Circle();

        square.draw();
        star.draw();
        circle.draw();


        // without polymorphic call
//        ArrayList<Square> squares = new ArrayList<>();
//        squares.add(square);
//
//        ArrayList<Star> stars = new ArrayList<>();
//        stars.add(star);
//
//        ArrayList<Circle> circles = new ArrayList<>();
//        circles.add(circle);


        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(square);
        shapes.add(star);
        shapes.add(circle);


        for (int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw();
        }
    }
}
