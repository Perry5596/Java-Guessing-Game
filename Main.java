import java.lang.System;
import java.util.Scanner;

// Number Guessing Game
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Math.round(Math.random() * 100);
        System.out.println("=== WELCOME TO THE NUMBER GUESSING GAME ===");
        System.out.println("The number is between 1 and 100. Start guessing below.");
        while (true) {
            System.out.print("Input: ");
            int guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("Correct!");
                break;
            }
        }
    }
}
