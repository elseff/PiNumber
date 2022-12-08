import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant start = Instant.now();
        System.out.println(PiNumber.getNumber(10000));
        Instant finish = Instant.now();
        Duration between = Duration.between(start, finish);
        System.out.println("Time is " + between.toMillis() + " milliseconds");
    }
}
