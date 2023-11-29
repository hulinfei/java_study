import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDate {
    public static void main(String[] args){
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date.getTime());
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(d);
        System.out.println(t);
        System.out.println(ldt);
        LocalDateTime lt = LocalDateTime.now();
        LocalDate ld = lt.toLocalDate();
        LocalTime localTime = lt.toLocalTime();
        System.out.println("当前日期时间是"+lt+"当前日期是"+ld+"当前时间是：" + localTime);
        LocalDate date1 = LocalDate.of(2023,11,28);
        LocalTime time = LocalTime.of(18,3,9);
        LocalDateTime localDateTime = LocalDateTime.of(2023,2,2,23,59,59);
        LocalDateTime localDateTime1 = LocalDateTime.of(date1, time);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse("2023/01/30 15:16:17", dtf);
        System.out.println(localDateTime2);
        System.out.println(dtf.format(LocalDateTime.now()));
        LocalDateTime localDateTime3 = LocalDateTime.of(2023,2,2,2,2,2);
        System.out.println(localDateTime3);
        LocalDateTime localDateTime4 = localDateTime3.plusDays(5).minusHours(2);
        System.out.println(localDateTime4);
        LocalDateTime localDateTime5 = localDateTime4.minusMonths(1);
        System.out.println(localDateTime5);
        LocalDateTime localDateTime6 = localDateTime5.withDayOfMonth(30);
        LocalDateTime localDateTime7 = localDateTime6.withMonth(12);
        System.out.println(localDateTime7);
        System.out.println(localDateTime6.isAfter(localDateTime7));
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(zny);
        LocalDateTime localDateTime8 = LocalDateTime.now();
        System.out.println("出发时间" + localDateTime8);
        LocalDateTime localDateTime9 = localDateTime8.plusHours(13).plusMinutes(20);
        ZonedDateTime z = localDateTime9.atZone(ZoneId.systemDefault());
        System.out.println("到达时间（北京）" + z);
        ZonedDateTime zonedDateTime1 = z.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("到达时间（纽约）" + zonedDateTime1);
        Instant instant = Instant.now();
        System.out.println(instant);
        long timestamp = System.currentTimeMillis();
        Instant instant1 = Instant.ofEpochMilli(timestamp);
        LocalDateTime localDateTime10 = LocalDateTime.ofInstant(instant1, ZoneId.of("UTC"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String f = localDateTime10.format(dateTimeFormatter);
        System.out.println(f);
    }
}
