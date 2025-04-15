package lecture42_class_modeling;

public class Waiter {
    // attributes
    private int id;
    private String firstName;
    private String lastName;
    private String workingHours;



    // constructors
    public Waiter() {
    }

    public Waiter(int id, String firstName, String lastName, String workingHours) {
        // this.id = id;
        // this.firstName = firstName;
        // this.lastName = lastName;
        // this.workingHours = workingHours;
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setWorkingHours(workingHours);
    }



    // properties (getters and setters)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getWorkingHours() {
        return this.workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }




    // methods (behaviours)
    public void serveFood(String foodName, int tableNumber) {
        System.out.println("Serving " + foodName + " at table " + tableNumber);
    }
}
