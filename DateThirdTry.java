public class DateThirdTry {
    private String month;
    private int day;
    private int year;

    public void setDate(int newMonth, int newDay, int newYear) {
        month = monthString(newMonth);
        day = newDay;
        year = newYear;
    }

    private String monthString(int monthNumber) {
        switch(monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                System.out.println("Fatal Error");
                System.exit(0);
                return "Error";
        }
    }

    public String getMonth() {
        return month;
    }

   // public void setMonth(String month) {
    //    this.month = month;
    //}

    public int getDay() {
        return day;
    }

    //public void setDay(int day) {
    //    this.day = day;
    //}

    public int getYear() {
        return year;
    }

    //public void setYear(int year) {
    // /   this.year = year;
    //}
}
