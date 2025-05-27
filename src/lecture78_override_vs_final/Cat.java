package lecture78_override_vs_final;

public class Cat extends Animal {

    @Override
    public void talk() {
        System.out.println("Mjau maju...");
    }


    //    @Override
//    public void thisMethodCannotChangeInChildren() {}
}
