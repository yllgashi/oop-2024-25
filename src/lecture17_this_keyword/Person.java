package lecture17_this_keyword;

public class Person {
    private String fullName; // global variable

    public String getFullName() {
        return fullName;
    }

    // fullName there is local variable
    public void setFullName(String fullName) {
        // with "this." we are referring to global variables or methods
       this.fullName = this.fullName; // value from local variable will be assigned to global variable
    }
}