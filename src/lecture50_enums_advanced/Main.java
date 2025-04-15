package lecture50_enums_advanced;

public class Main {
    public static void main(String[] args) {
        // show only values
        for (Book b : Book.values()) {
            System.out.println(b);
        }

        // show title authors
        for (Book b : Book.values()) {
            System.out.println(b.getTitle() + " - " + b.getAuthor());
        }
    }
}
