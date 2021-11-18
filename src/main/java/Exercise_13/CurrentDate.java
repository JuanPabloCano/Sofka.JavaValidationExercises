package Exercise_13;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CurrentDate {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        currentDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        currentTime.format(DateTimeFormatter.ofPattern("hh-mm-ss"));

        System.out.println("Fecha "+ currentDate +" "+ "Hora: "+ currentTime);
    }
}
