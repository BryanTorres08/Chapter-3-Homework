/**
 *
 * Class: weekday
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will ask the user to enter the day of the week an number between 1 and 7.
 *
 */


import java.util.Scanner;

public class weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week (1 for Sunday, 2 for Monday, ..., 7 for Saturday):");
        int dayofWeek = scanner.nextInt();

        switch (dayofWeek) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid weekday");
                break;

        }
        scanner.close();
    }
}
