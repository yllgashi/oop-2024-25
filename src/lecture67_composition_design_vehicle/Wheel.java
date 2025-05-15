package lecture67_composition_design_vehicle;

public class Wheel {
    private int id;
    private String color;
    private int size;

    public Wheel() {
    }

    public Wheel(int id, String color, int size) {
        this.setId(id);
        this.setColor(color);
        this.setSize(size);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
