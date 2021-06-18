package SecondLevel;

import java.util.Scanner;

public class AddNumbers {

    private static Scanner scanner = new Scanner(System.in);
    private static final int minRandom = 20;
    private static final int maxRandom = 50;
    private static final int minUserInput = 5;
    private static final int maxUserInput = 20;

    public static void main(String[] args) {

        int randomNumber = (int) ((Math.random() * (maxRandom - minRandom)) + minRandom);
        int firstNumber, secondNumber;

        do {
            //First number check.
            do {
                System.out.println("Please enter first number in range 5-20:");
                firstNumber = scanner.nextInt();

                if (!inRange(firstNumber)) {
                    System.out.println("The number you have entered is not in range 5-20");
                }
            } while (!inRange(firstNumber));

            //Second number check.
            do {
                System.out.println("Please enter second number in range 5-20:");
                secondNumber = scanner.nextInt();

                if (!inRange(secondNumber)) {
                    System.out.println("The number you have entered is not in range 5-20");
                }

            } while (!inRange(secondNumber));

            if(firstNumber + secondNumber == randomNumber) {
                System.out.println("Success ! The sum of the numbers you've entered is " + randomNumber + "!");
            }

            else if(firstNumber + secondNumber > randomNumber) {
                System.out.println("The sum of the numbers you've entered exceeded the random number" +
                        " which is "+ randomNumber + "."  + " See you next time !");
            }

            else if(firstNumber + secondNumber < randomNumber) {
                System.out.println("The sum of the numbers you've entered is less than random number. Try again !");
            }

        } while ((firstNumber + secondNumber < randomNumber));

    }

    public static boolean inRange(int num) {
        if(num >= minUserInput && num <= maxUserInput) {
            return true;
        }
        return false;
    }

}
