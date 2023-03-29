import java.util.ArrayList;

public class CalendarApp {
    private CalendarFrame calendarWindow;
    private Calendar calendar;
    private ArrayList<Calendar> calendarsList;

    public CalendarApp(){
        calendarWindow = new CalendarFrame(this);
        calendar = null;
        calendarsList = new ArrayList<>();

    }


}
