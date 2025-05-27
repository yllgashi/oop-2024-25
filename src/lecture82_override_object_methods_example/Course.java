package lecture82_override_object_methods_example;

public class Course {
    // attributes
    private int id;
    private String title;
    private String description;

    public Course(int id, String title, String description) {
        this.setId(id);
        this.setTitle(title);
        this.setDescription(description);
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // override toString() method

    @Override
    public String toString() {
        return "ID: " + this.getId() + ", Title: " + this.getTitle() + ", Description: " + this.getDescription();
    }
}










