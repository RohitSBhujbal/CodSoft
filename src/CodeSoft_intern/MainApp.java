
package CodeSoft_intern;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter initial balance for the bank account:");
        double initialBalance = getUserInput(scanner);

        BankAccount userAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(userAccount);

        int option;
        while (true) {
            atm.displayOptions();
            System.out.println("Enter your choice (1-4):");
            option = (int) getUserInput(scanner);

            if (option == 4) {
                System.out.println("Exiting ATM. Thank you!");
                break;
            }

            if (option == 3) {
                atm.processTransaction(option, 0); 
            } else {
                System.out.println("Enter the amount:");
                double amount = getUserInput(scanner);
                atm.processTransaction(option, amount);
            }
        }

        scanner.close();
    }

    private static double getUserInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid numeric value.");
                scanner.next(); // consume the invalid input
            }
        }
    }
}
