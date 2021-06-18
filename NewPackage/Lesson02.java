package NewPackage;

import java.util.Scanner;

public class Lesson02 {

    public static void main(String[] args) {

        printValue("Sharon", 10);


     //   System.out.println(weekDay(8));
    }

    public static String weekDay(int num) {

        switch (num) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Teusday";
            case 4: return "Wedensday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Bad input";
        }
    }

    public static void printValue(String s, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(s);
        }
    }
}
