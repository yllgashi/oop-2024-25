package lecture100_abstact_class;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("------------");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("|           |");
        System.out.println("------------");
    }
}
