/**
 *
 * Class: BiggestNumber
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will read the given numbers by the user and print the largest number.
 *
 */


import java.util.Scanner;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
