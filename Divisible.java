/**
 *
 * Class: Divisible
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will ask the user to enter a number and check weather if the number is divisible by 3 and 5.
 *
 */


import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("The number is a multiple of 3 and a multiple of 5");
        } else if (number % 3 == 0 ^ number % 5 == 0) {
            System.out.println("The number is divisible by either 3 or 5 but now both.");
        } else {
            System.out.println("The number is not divisible by either 3 or 5.");
        }

        scanner.close();
    }
}
