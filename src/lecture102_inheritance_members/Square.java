package lecture102_inheritance_members;

public class Square extends Shape {
    private int id;
    private int a;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("--------");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("|       |");
        System.out.println("--------");

    }
}
