package lecture78_override_vs_final;

public class Animal {
    public String name;
    public String color;

    public void talk() {
        System.out.println("...");
    }

    // this method cannot be overriden in child classes
    public final void thisMethodCannotChangeInChildren() {
        System.out.println("This is animal");
    }
}
