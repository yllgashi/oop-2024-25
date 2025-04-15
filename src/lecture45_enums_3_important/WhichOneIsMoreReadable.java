package lecture45_enums_3_important;

public class WhichOneIsMoreReadable {
    public static void main(String[] args) {
        // without enum
        String seasonFromUserAsString = "Spring";

        if (seasonFromUserAsString.equals("Spring")) {
            System.out.println("You have chosen Spring");
        }



        // with enum
        Season seasonFromUserAsEnum = Season.SPRING;

        if (seasonFromUserAsEnum == Season.SPRING) {
            System.out.println("You have chosen Spring");
        }



    }
}
