package lecture49_enum_as_method_parameter;

public class Main {
    public static void main(String[] args) {
        // simple enum
        DayOfWeek dayOne = DayOfWeek.MONDAY;
        showDayInformationOne(dayOne);


        // advanced enum
        AdvancedDayOfWeek dayFifth = AdvancedDayOfWeek.FRIDAY;
        showDayInformationTwo(dayFifth);

    }

    public static void showDayInformationOne(DayOfWeek day) {
        switch (day) {
            case MONDAY:
                System.out.println("Monday is not the best");
                break;
            case FRIDAY:
                System.out.println("Friday is the best");
                break;
        }
    }

    public static void showDayInformationTwo(AdvancedDayOfWeek day) {
        System.out.println(day.getDescription());
    }
}
