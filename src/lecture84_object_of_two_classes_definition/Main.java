package lecture84_object_of_two_classes_definition;

public class Main {
    public static void main(String[] args) {
        Eagle eagle1 = new Eagle(); // save Eagle object at Eagle variable
        Bird bird1 = new Eagle(); // save Eagle object at Bird variable (because Eagle object is also Bird object)

        eagle1.talk_MethodOfParent(); // calling method of PARENT
        bird1.talk_MethodOfParent(); // calling method of PARENT

        eagle1.getFood_MethodOfChild(); // calling method of CHILD
        // bird1.getFood_MethodOfChild(); // calling method of CHILD (ERROR because from Bird view we cannot see attributes&methods which are created at Eagle level)
    }
}
