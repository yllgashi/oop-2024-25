package lecture72_inheritance_with_access_modifiers;

public class Student extends Person {

    public void showInformation() {
        // System.out.println("Private id: " + this.id);
        System.out.println("Protected firstName: " + this.firstName);
        System.out.println("Public lastName: " + this.lastName);
    }
}
