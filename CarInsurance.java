/**
 *
 * Class: CarInsurance
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will calculate the cost of car insurance based on the driver age and number of accidents.
 *
 */


import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {
        int baseCost = 300;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter driver's age: ");
        int age = scanner.nextInt();

        System.out.println("Enter number of accidents: ");
        int numAccidents = scanner.nextInt();


        int surcharge = 0;

        if (age < 27) {
            surcharge += 100;
        }

        switch (numAccidents) {
            case 1:
                surcharge += 100;
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                surcharge += 1000;
                break;
        }

        int totalCost = baseCost + surcharge;

        System.out.println("Total insurance cost: $" + totalCost);

        scanner.close();
    }
}
