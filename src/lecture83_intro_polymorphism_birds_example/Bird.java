package lecture83_intro_polymorphism_birds_example;

public class Bird {
    // attributes
    private String name;
    private String color;


    // constructors
    public Bird(String name, String color) {
        this.setName(name);
        this.setColor(color);
    }



    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // methods
    public void talk() {
        System.out.println("No information...");
    }
}
