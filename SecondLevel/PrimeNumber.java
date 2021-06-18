package SecondLevel;

import java.util.Scanner;

public class PrimeNumber {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        do {
            System.out.println("Please enter a positive number:");
            num = scanner.nextInt();
            if(num < 0) {
                System.out.println("You have entered a negative number.");
            }
        }while (num < 0);

        isPrime(num);
    }

    public static void isPrime(int num) {
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        int count = 0;

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                count++;
            }
        }

        if(count == 0) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }

    }
}
