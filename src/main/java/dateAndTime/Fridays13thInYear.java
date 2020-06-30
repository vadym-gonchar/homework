package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Fridays13thInYear {

    public static void main(String[] args) {

        LocalDate.of(2020, 1, 1).datesUntil(LocalDate.of(2020, 12, 31))
                .filter(localDate -> localDate.getDayOfMonth() == 13 && localDate.getDayOfWeek() == DayOfWeek.FRIDAY)
                .forEach(System.out::println);
    }
}