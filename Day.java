import java.util.HashMap;
import java.util.Map;

public class Day{
    public enum daysOfWeek{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }
    public enum monthsOfYear{
        January, 
        February, 
        March, 
        April, 
        May, 
        June, 
        July, 
        August, 
        September, 
        October, 
        November, 
        December
    }

    public Day(){
        daysPerMonth = new HashMap<>();
        daysPerMonth.put("January", 31);
        daysPerMonth.put("February", 28);
        daysPerMonth.put("March", 31);
        daysPerMonth.put("April", 30);
        daysPerMonth.put("May", 31);
        daysPerMonth.put("June", 30);
        daysPerMonth.put("July", 31);
        daysPerMonth.put("August", 31);
        daysPerMonth.put("September", 30);
        daysPerMonth.put("October", 31);
        daysPerMonth.put("November", 30);
        daysPerMonth.put("December", 31);
    }

    private Map<String, Integer> daysPerMonth;
    private daysOfWeek dayOfWeek;
    private int year;
    private int month;
    private int day;
    private Day epoch;
}