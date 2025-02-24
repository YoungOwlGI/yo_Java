package view.other;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class homework1120 {
    public static void main(String[] args) {

        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println(formattedTime);
    }
}
