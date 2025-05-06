package lecture56_object_logging;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Filan", "Fisteku");
        User user2 = new User(2, "Niman", "Demiri");

        Book book1 = new Book(1, "Meshari", "Libri I pare I gjetur ne gjuhen shqipe me shkronja latine", user1.getId());


        System.out.println("***************");
        System.out.println(book1.getId());
        System.out.println(book1.getTitle());
        System.out.println(book1.getDescription());
        System.out.println(book1.getInsertBy());
        System.out.println(book1.getInsertDate());

        // make an update
        book1.setTitle("Mesharri", user2.getId(), "U nderrua titulli per shkak se ka qene i gabuar ne fillim");

        System.out.println("***************");
        System.out.println(book1.getId());
        System.out.println(book1.getTitle());
        System.out.println(book1.getDescription());
        System.out.println(book1.getInsertBy());
        System.out.println(book1.getInsertDate());
        System.out.println(book1.getUpdateBy());
        System.out.println(book1.getUpdateDate());
        System.out.println(book1.getUpdateComment());

    }
}
