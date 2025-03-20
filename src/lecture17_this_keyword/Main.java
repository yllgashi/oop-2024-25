package lecture17_this_keyword;

public class Main {
    private  int a ;
    public static void main(String[] args) {
        // create object
        Person person1 = new Person();

        // initialize fullname attribute through set-property
        person1.setFullName("Filan Fisteku");

        // get fullname attribute through get-property
        System.out.println(person1.getFullName());
    }
}
