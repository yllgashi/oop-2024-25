package lecture78_override_vs_final;

public class Dog extends Animal {


    @Override
    public void talk() {
        System.out.println("Ham ham...");
    }

//    @Override
//    public void thisMethodCannotChangeInChildren() {}
}
