package ThirdLevel;

public class WeekDays {

    public static void main(String[] args) {
        System.out.println(calcWeekDay(5));
    }

    public static String calcWeekDay(int num) {
        switch (num) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Bad input";
        }
    }
}
