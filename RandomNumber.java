/**
 *
 * Class : RandomNumber
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will generate a random number between 0 and 10, and ask the user to guess the number.
 *
 */


import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

         int rand = (int)(Math.random() * 11);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the Number (between 0 and 10): ");
        int guess = scanner.nextInt();

        if (guess == rand) {
            System.out.println("Hooray! You guessed the number.");
        } else {
            System.out.println("Sorry, you lost. The number was " + rand + ".");
        }

        scanner.close();
    }
}
