
enum Day {
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumDemo {
    public static void main(String[] args) {

        Day today = Day.SUNDAY;

        switch (today) {
            case SATURDAY:
            case SUNDAY:
                System.out.println("Holiday");
                break;

            default:
                System.out.println("Working Day");
        }
    }
}
