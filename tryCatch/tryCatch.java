package tryCatch;

import java.util.Scanner;

public class tryCatch {

    private static Scanner scanner = new Scanner(System.in);
    private static final int FOUR_CHARS = 4;

    public static void main(String[] args){

        String input;
        try {
            System.out.println("Please enter a string with a least 4 chars:");
            input = scanner.nextLine();

            if(input.length() < FOUR_CHARS) {
                throw new Exception("Need string with more than 4 chars");
            }
            else {
                System.out.println("Four last chars: " + input.substring(input.length() - FOUR_CHARS));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
