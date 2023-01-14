package backjoon;

import java.io.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class backjoon_16170 {
    public static void main(String[] args) throws IOException {
    	ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zonedDateTime.getYear());
        System.out.println(zonedDateTime.getMonthValue());
        System.out.println(zonedDateTime.getDayOfMonth());
    }
}

// ZonedDateTime = LocalDateTime + 시차/타임존