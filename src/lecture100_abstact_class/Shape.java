package lecture100_abstact_class;

public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void draw() {
//        System.out.println("I am drawing a shape");
//    }

    public abstract void draw();
}
