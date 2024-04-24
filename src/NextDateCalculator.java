public class NextDateCalculator {

    public static String getNextDate(int day, int month, int year) {
        int nextDay, nextMonth, nextYear;
        
        // Get the last day of the current month
        int lastDayOfMonth = getLastDayOfMonth(month, year);
        
        // Check if the given day is the last day of the month
        if (day == lastDayOfMonth) {
            nextDay = 1;
            // Check if the given month is December
            if (month == 12) {
                nextMonth = 1;
                nextYear = year + 1;
            } else {
                nextMonth = month + 1;
                nextYear = year;
            }
        } else {
            nextDay = day + 1;
            nextMonth = month;
            nextYear = year;
        }
        
        // If the next day is 29/2 in a non-leap year, return 1/3 instead
        if (nextDay == 29 && nextMonth == 2 && !isLeapYear(nextYear)) {
            nextDay = 1;
            nextMonth = 3;
        }
        
        return nextDay + "/" + nextMonth + "/" + nextYear;
    }

    // Helper method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Helper method to get the last day of a month
    private static int getLastDayOfMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28; // February
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30; // April, June, September, November
        } else {
            return 31; // January, March, May, July, August, October, December
        }
    }

    
}
