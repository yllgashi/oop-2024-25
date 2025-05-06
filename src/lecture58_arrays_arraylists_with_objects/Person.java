package lecture58_arrays_arraylists_with_objects;

public class Person {
    // attributes
    private int id;
    private String firstName;
    private String lastName;
    private double height;

    // constructors
    public Person() {
    }

    public Person(int id, String firstName, String lastName, double height) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setHeight(height);
    }


    // properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
