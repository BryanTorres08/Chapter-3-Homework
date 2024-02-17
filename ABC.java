/**
 *
 * Class : RandomNumber
 * @Author: Bryan Torres
 * @Verison: 1.0
 * Course: ITEC2140 Section 13 Spring 2024
 * Description: This program will simulate the fall-through by using switch statements.
 *
 */


import java.util.Random;

public class ABC {
    public static void main(String[] args) {

        Random random = new Random();
        char alphabet = (char) (random.nextInt(26) + 'A');


        System.out.println("The alphabet '" + alphabet + "' is ");


        switch (alphabet) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("a vowel");
                break;
            // Fall-through to the next case
            case 'B':
            case 'b':
            case 'C':
            case 'c':
            case 'D':
            case 'd':
                System.out.println("a consonant");
                break;
            default:
                System.out.println("not an alphabet character");
                break;
        }
    }
}
