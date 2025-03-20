package lecture19_online_shopping;

public class Product {
    // attributes
    private int id;
    private String title;
    private String description;
    private String origin;
    private String category;
    private double price;
    private double discountInPercentage;
    private float rating;
    private String imageUrl;
    private boolean inStock;

    // properties (getters and setters)
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
