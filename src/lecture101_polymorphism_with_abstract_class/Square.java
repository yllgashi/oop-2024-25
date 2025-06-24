package lecture101_polymorphism_with_abstract_class;

public class Square extends Shape {
    private int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void draw() {
        System.out.println("---------");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("|        |");
        System.out.println("---------");
    }
}
