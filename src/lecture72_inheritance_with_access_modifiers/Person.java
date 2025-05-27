package lecture72_inheritance_with_access_modifiers;

public class Person {
    private int id;
    protected String firstName;
    public String lastName;

    public void showInformation() {
        System.out.println("Private id: " + this.id);
        System.out.println("Protected firstName: " + this.firstName);
        System.out.println("Public lastName: " + this.lastName);
    }
}
