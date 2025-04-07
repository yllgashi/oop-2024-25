package lecture30_variable_shadow;

public class Person {
    private String firstName; // firstName there is a global variable


    // firstName there is a local variable (which shadows global variable with the same name)
    public void setFirstName(String firstName) {
        firstName = "Filan";
    }
}
