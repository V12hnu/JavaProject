package CollectionNEW;

/**
 * Created by vishnu on 20/07/18.
 */
import java.time.LocalDate;
import java.time.LocalTime;
public class DateEx {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalTime time=LocalTime.now();
        System.out.println(time);
    }
}
