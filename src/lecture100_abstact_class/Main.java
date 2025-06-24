package lecture100_abstact_class;

public class Main {
    public static void main(String[] args) {
        Star star = new Star();
        star.setName("Ylli");
        star.draw();

        Square square = new Square();
        square.setName("Katrori");
        square.draw();

        // it makes non sense

        // so:
        // abstact class is a class where there should be minimum one abstact member (method without implementaion)
        // abstact method should always be overriden at children
        // then we cannot create a parent "Shape" object

        // Shape shape = new Shape();
        // shape.setName("Drejtkendeshi");
        // shape.draw(); //
    }
}
