package dateAndTime;

import java.time.*;

public class MonthLength {
    public static void main(String[] args) {

        int year, month;
        year = 2020;

        for (month = 1; month <= 12; month++) {

            YearMonth yearMonth = YearMonth.of(year, month);
            int daysInMonth = yearMonth.lengthOfMonth();
            System.out.println(daysInMonth);
        }
    }
}