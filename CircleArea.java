/**
 *
 * Class: CircleArea
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This Program will ask the user to enter the radius of a circle and calculate the area for that circle.
 *
 */


import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");

        double radius = scanner.nextDouble();

        if (radius < 0) {
            System.out.println("Invalid Entry. The radius should be positive.");
            System.exit(0);
        }

        double area = Math.PI * radius * radius;

        System.out.println("The area of a circle with radius " + radius + " is " + area + ".");

        scanner.close();

    }
}
