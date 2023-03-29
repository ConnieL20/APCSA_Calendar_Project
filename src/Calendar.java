public class Calendar {
    private String month;
    private int day;
    private int year;

    public Calendar(String month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;

    }

    //getter and setter methods
    public String getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }

    public void setMonth(String newMonth){
        month = newMonth;
    }

    public void setDay(int newDay){
        day = newDay;
    }

    public void setYear(int newYear){
        year = newYear;
    }


}
