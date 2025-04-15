package lecture48_enums_advanced;

import lecture26_new_keyword.Person;

public class Main {
    public static void main(String[] args) {
        String bingURL = SearchEngine.BING.getUrl();
        String googleURL = SearchEngine.GOOGLE.getUrl();


        System.out.println(bingURL);
        System.out.println(googleURL);
    }
}
