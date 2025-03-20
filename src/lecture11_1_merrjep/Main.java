package lecture11_1_merrjep;

public class Main {
    public static void main(String[] args) {
        House house1 = new House();
        house1.title = "Shitet shtepia Veternik";
        house1.description = "Shitet shtëpia";
        house1.spaceInSquare = 209;
        house1.roomsNumber = 6;
        house1.hasAssets = true;
        house1.status = "New";
        house1.price = 200_000;

        House house2 = new House();
        house2.title = "Shitet shtepia Qender";
        house2.description = "Shitet shtëpia ne qender";
        house2.spaceInSquare = 100;
        house2.roomsNumber = 3;
        house2.hasAssets = false;
        house2.status = "Old";
        house2.price = 300_000;


        // In website you will need to show these info with html/css/js

        // Currently we know only Command-line Interface
        House[] houses = new House[2];
        houses[0] = house1;
        houses[1] = house2;


        for (int i = 0; i < houses.length; i++) {
            System.out.println("####### House" + i + " #######");
            System.out.println("Title: " + houses[i].title);
            System.out.println("Description: " + houses[i].description);
            System.out.println("Space In Square: " + houses[i].spaceInSquare);
            System.out.println("Rooms Number: " + houses[i].roomsNumber);
            System.out.println("Has Assets: " + houses[i].hasAssets);
            System.out.println("Status: " + houses[i].status);
            System.out.println("Price: " + houses[i].price);
        }
    }
}
