import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        Date novaData = new Date();
        System.out.println(novaData);
        // Tue Mar 09 21:38:04 BRT 2021

        Long currentTimeMillins = System.currentTimeMillis();
        System.out.println(currentTimeMillins);
        // 1615336684804

        java.time.LocalDateTime teste = java.time.LocalDateTime.of(2010, Month.MAY, 15, 10, 00, 00);
        System.out.println(teste);

        java.time.LocalDateTime futuro = teste.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(futuro);
    }
}
