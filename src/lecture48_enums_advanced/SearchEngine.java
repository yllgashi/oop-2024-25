package lecture48_enums_advanced;

public enum SearchEngine {
    // objects (created only inside this special class)
    GOOGLE("https://www.google.com"),
    BING("https://www.bing.com");



    // attributes
    private String url;



    // constructor
    private SearchEngine(String url) {
        this.url = url;
    }


    // properties (only getters)
    public String getUrl() {
        return this.url;
    }
}
