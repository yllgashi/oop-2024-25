package lecture63_one_to_one_relationship;

public class Brain {
    // attributes
    private String color;
    private double sizeInCm;


    // constructors
    public Brain(String color, double sizeInCm) {
        this.setColor(color);
        this.setSizeInCm(sizeInCm);
    }



    // getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSizeInCm() {
        return sizeInCm;
    }

    public void setSizeInCm(double sizeInCm) {
        this.sizeInCm = sizeInCm;
    }
}
