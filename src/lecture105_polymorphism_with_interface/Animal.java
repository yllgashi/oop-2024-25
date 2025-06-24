package lecture105_polymorphism_with_interface;

public class Animal implements Creation {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    @Override
    public void talk() {
        System.out.println("Animal is talking");
    }
}
