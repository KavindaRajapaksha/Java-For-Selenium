package day18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  //one try block can have multiple catch blocks
        try {
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();

            System.out.println(100 / num);
        } catch (ArithmeticException e) {
            System.out.println("Invalid data: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input: Please enter an integer.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("final block add");
            scanner.close(); // Closing the scanner to avoid resource leaks
        }
    }
}
