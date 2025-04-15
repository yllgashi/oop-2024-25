package lecture50_enums_advanced;

public enum Book {
    JHTP("JAVA How To Program", "Filan Fisteku"),
    CHTP("C How To Program", "Filan Fisteku2"),
    CSHARPHTP("C# How To Program", "Filan Fisteku3");

    // attributes
    private String title;
    private String author;


    // constructor
    private Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // properties
    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
}
