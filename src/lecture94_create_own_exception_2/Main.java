package lecture94_create_own_exception_2;

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyOwnException();
        } catch (MyOwnException e) {
        } catch (Exception e) {
        }
    }
}
