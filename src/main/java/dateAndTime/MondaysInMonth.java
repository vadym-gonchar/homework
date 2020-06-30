package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MondaysInMonth {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2020, 6, 1).with(DayOfWeek.MONDAY);
        LocalDate endDate = LocalDate.of(2020, 6, 30);

        while (startDate.isBefore(endDate)) {
            System.out.println(startDate);
            startDate = startDate.plusWeeks(1);
        }
    }
}