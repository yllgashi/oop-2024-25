package lecture68_composition_hr_system;

public class Country {
    // attributes
    private int id;
    private String name;


    // constructors
    public Country() {
    }

    public Country(int id, String name) {
        this.setId(id);
        this.setName(name);
    }


    // getters and setters
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
}
