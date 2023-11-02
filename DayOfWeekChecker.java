import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekChecker {
    public static void main(String[] args) {
        int year = 2023;
        int month = 11;
        int day = 2;

        LocalDate dateToCheck = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = dateToCheck.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            System.out.println(dateToCheck + " is a weekend day (" + dayOfWeek + ")");
        } else {
            System.out.println(dateToCheck + " is a weekday (" + dayOfWeek + ")");
        }
   }
}