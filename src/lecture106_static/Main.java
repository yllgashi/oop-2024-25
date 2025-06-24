package lecture106_static;

public class Main {
    public static void main(String[] args) {
        double result = Math.sqrt(4); // static method


        double result2 = MyMath.squareRootOfNumberSTATIC(10);  // static method

        MyMath myMath = new MyMath();
        double result3 = myMath.squareRootOfNumberNON_STATIC(10); // non-static (an object must be created)


        // double result4 = MyMath.squareRootOfNumberNONSTATIC(20);
    }
}
