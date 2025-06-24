package lecture102_inheritance_members;

public class Main {
    public static void main(String[] args) {
        // create square object
        Square square = new Square();
        square.setA(1);
        square.setId(1);
        square.setName("Square1");

        // we are calling methods and attributes of class Square and Shape
        System.out.println(square.getA());
        System.out.println(square.getName());
        System.out.println(square.getId());


        // create Shape pointer
        Shape squareAsShape = square;
        squareAsShape.draw(); // this method exists in parent

        // we cannot have access because these methods and atrributes exists only in child
        // System.out.println(squareAsShape.getA());
        // System.out.println(squareAsShape.getName());
        // System.out.println(squareAsShape.getId());


        Square squareAsSquare = (Square) squareAsShape;

        System.out.println(squareAsSquare.getA());
        System.out.println(squareAsSquare.getName());
        System.out.println(squareAsSquare.getId());
    }
}
