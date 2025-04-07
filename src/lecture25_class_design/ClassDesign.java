package lecture25_class_design; // package (folder name)

import java.time.LocalDate; // class imported from another package

// class name
public class ClassDesign {

    // attributes
    private String name;
    private LocalDate objectFromAnotherPackage;


    // properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods
    public String returnSomething() {
        return "ABC";
    }
}
