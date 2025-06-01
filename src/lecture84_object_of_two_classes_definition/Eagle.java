package lecture84_object_of_two_classes_definition;

public class Eagle extends Bird {

    @Override
    public void talk_MethodOfParent() {
        System.out.println("Skrr skrrr...");
    }

    public void getFood_MethodOfChild() {
        System.out.println("Food got...");
    }
}
