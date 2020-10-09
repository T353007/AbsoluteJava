
public class EnumDemo {
    public static void main(String[] args) {
        WorkDay startDay = WorkDay.MONDAY;
        WorkDay endDay = WorkDay.FRIDAY;

        System.out.println("Work starts on " + startDay);
        System.out.println("Work ends on " + endDay);
    }

    enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY}
}
