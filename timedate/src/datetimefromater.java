import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
public class datetimefromater {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Before Formatting: " + now);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formatDateTime = now.format(format);
        System.out.println("After Formatting: " + formatDateTime);

        Calendar c = Calendar.getInstance();

        // Print corresponding instances by passing
        // required some as in arguments
        System.out.println("Day of week : " + c.get(Calendar.DAY_OF_WEEK));

        System.out.println("Day of year : " + c.get(Calendar.DAY_OF_YEAR));

        System.out.println("Week in Month : " + c.get(Calendar.WEEK_OF_MONTH));

        System.out.println("Week in Year : " + c.get(Calendar.WEEK_OF_YEAR));

        System.out.println("Day of Week in Month : " + c.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println("Hour : " + c.get(Calendar.HOUR));

        System.out.println("Minute : " + c.get(Calendar.MINUTE));

        System.out.println("Second : " + c.get(Calendar.SECOND));

        System.out.println("AM or PM : " + c.get(Calendar.AM_PM));

        System.out.println("Hour (24-hour clock) : " + c.get(Calendar.HOUR_OF_DAY));
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: "
                + currentDateTime);
    }
}