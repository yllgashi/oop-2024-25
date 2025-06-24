package lecture99_with_abstact_class;

public abstract class Animal {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void walk() {
//        System.out.println("I am walking with two foots");
//    }
//
//    public void talk() {
//        System.out.println("I am talking...");
//    }

    public abstract void walk();

    public abstract void talk();
}





