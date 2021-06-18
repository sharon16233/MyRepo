package SecondLevel;

import java.util.Scanner;

public class SplitText {

    private static String[] arrayOfStrings;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("Enter text with at least 2 words:");
            String userInput = scanner.nextLine();
            arrayOfStrings = userInput.split(" ");

            if(arrayOfStrings.length < 2) {
                System.out.println("You have entered text with less than 2 words !");
            }
        }while (arrayOfStrings.length < 2);

        System.out.println("The input contains the words:");
        for(String word: arrayOfStrings){
            System.out.println(word);
        }

    }
}
