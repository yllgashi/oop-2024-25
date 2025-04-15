package lecture44_enums_2;

public class Main {
    public static void main(String[] args) {
        // with class
        SeasonClass spring = new SeasonClass("Spring");
        SeasonClass summer = new SeasonClass("Summer");
        SeasonClass fall = new SeasonClass("Fall");
        SeasonClass winter = new SeasonClass("Winter");

        System.out.println(spring.getName());
        System.out.println(summer.getName());
        System.out.println(fall.getName());
        System.out.println(winter.getName());

        // with enum
        System.out.println(SeasonEnum.SPRING);
        System.out.println(SeasonEnum.SUMMER);
        System.out.println(SeasonEnum.FALL);
        System.out.println(SeasonEnum.WINTER);
    }

}
