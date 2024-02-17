/**
 *
 * Class: BMI
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will compute and interprets the Body Mass Index.
 *
 */


import java.util.Scanner;


public class BMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        scanner.close();

        double weightKilograms = weightPounds * 0.4536;

        double heightMeters = heightInches * 0.0254;

        double bmi = weightKilograms / (heightMeters * heightMeters);

        String interpretation;
        if (bmi < 18.5) {
            interpretation = "Underweight";
        } else if (bmi < 25) {
            interpretation = "Normal weight";
        } else if (bmi < 30) {
            interpretation = "Overweight";
        } else {
            interpretation = "Obese";
        }

        System.out.println("Your BMI is: " + bmi);
        System.out.println("Interpretation: " + interpretation);
    }
}

