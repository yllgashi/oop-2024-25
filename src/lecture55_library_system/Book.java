package lecture55_library_system;

public class Book {
    // attributes
    private int id;
    private String IBAN;
    private String title;
    private String description;
    private double price;

    private String[] author;
    private BookCategory bookCategory;


    // constructors
    public Book(int id, String title) {
        this.setId(id);
        this.setIBAN(getIBAN());
    }

    public Book() {
    }


    // properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getAuthor() {
        return author;
    }

    public void setAuthor(String[] author) {
        this.author = author;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // behaviour methods
    public void startReading() {
        System.out.println("This book is all about " + this.getTitle());
    }
}
