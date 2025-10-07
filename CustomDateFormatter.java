class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public boolean isValid() {
        if (year < 1 || month < 1 || month > 12 || day < 1)
            return false;

        int[] daysInMonth = { 31, isLeapYear() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        return day <= daysInMonth[month - 1];
    }
    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public void nextDay() {
        int[] daysInMonth = { 31, isLeapYear() ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        day++;
        if (day > daysInMonth[month - 1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
    }
    public String formatDate() {
        return String.format("%02d-%02d-%04d", day, month, year);
    }
    public void display() {
        if (isValid()) {
            System.out.println("Current Date: " + formatDate());
        } else {
            System.out.println("Invalid Date!");
        }
    }
}
public class CustomDateFormatter {
    public static void main(String[] args) {
        MyDate date = new MyDate(28, 2, 2024);

        date.display();
        date.nextDay();
        date.display(); 
    }
}
