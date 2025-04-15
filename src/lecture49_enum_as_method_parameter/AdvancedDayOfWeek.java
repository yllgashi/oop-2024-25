package lecture49_enum_as_method_parameter;

public enum AdvancedDayOfWeek {
    // objects of enum
    MONDAY("Monday is not the best"),
    FRIDAY("Friday is the best");



    // attributes
    private String description;



    // constructors
    private AdvancedDayOfWeek(String description) {
        this.description = description;
    }



    // properties
    public String getDescription() {
        return this.description;
    }
}
