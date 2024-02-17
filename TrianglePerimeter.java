/**
 *
 * Class: TrianglePerimeter
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will ask the user to enter the length of the three edges of a triangle. The program calculates the perimeter of the triangle.
 *
 */


import java.util.Scanner;

public class TrianglePerimeter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three edges of the triangle:");
        double edge1 = scanner.nextDouble();
        double edge2 = scanner.nextDouble();
        double edge3 = scanner.nextDouble();

        scanner.close();

        if (isValidTriangle(edge1, edge2, edge3)) {

            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter of the triangle is: " + perimeter);
        } else {
            System.out.println("Invalid input. The input does not form a valid triangle.");
        }
    }
    public static boolean isValidTriangle(double edge1, double edge2, double edge3) {
        return (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1);

    }
}
