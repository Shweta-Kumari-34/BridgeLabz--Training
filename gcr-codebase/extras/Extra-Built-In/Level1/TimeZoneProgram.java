import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
//creating a class with name as TimeZoneProgram

public class TimeZoneProgram {
public static void main(String[] args) {
// Formatter to display date and time nicely
 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

// Current time in GMT
ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
System.out.println("Current time in GMT: " + gmtTime.format(formatter));

// Current time in IST (Indian Standard Time)
ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
System.out.println("Current time in IST: " + istTime.format(formatter));

// Current time in PST (Pacific Standard Time)
ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
System.out.println("Current time in PST: " + pstTime.format(formatter));
}
}
