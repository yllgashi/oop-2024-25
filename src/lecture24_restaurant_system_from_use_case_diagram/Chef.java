package lecture24_restaurant_system_from_use_case_diagram;

public class Chef {
    // attributes
    private int id;
    private String firstName;
    private String lastName;
    private int yearsExperience;

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

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    // methods
    public void confirmOrder(Order order) {
        order.setConfirmed(true);
    }
}
