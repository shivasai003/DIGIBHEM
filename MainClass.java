package Demo;
import java.io.*;

import java.util.*;

public class MainClass {
 public static void main(String[] args) {
     ATM atm = new ATM();
     AtmOperation atmOperation = new AtmOperation(atm);
     Scanner scanner = new Scanner(System.in);

     System.out.println("Welcome to ATM Machine !!!");

     // Simulating login
     System.out.print("Enter Atm Number: ");
     int atmNumber = scanner.nextInt();
     System.out.print("Enter Pin: ");
     int pin = scanner.nextInt();

     int choice;
     do {
         System.out.println("1. View Available Balance");
         System.out.println("2. Withdraw Amount");
         System.out.println("3. Deposit Amount");
         System.out.println("4. View Mini Statement");
         System.out.println("5. Exit");
         System.out.print("\nEnter Choice: ");
         choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 atmOperation.viewBalance();
                 break;
             case 2:
                 System.out.print("Enter amount to withdraw: ");
                 double withdrawAmount = scanner.nextDouble();
                 atmOperation.withdrawAmount(withdrawAmount);
                 break;
             case 3:
                 System.out.print("Enter Amount to Deposit: ");
                 double depositAmount = scanner.nextDouble();
                 atmOperation.depositAmount(depositAmount);
                 break;
             case 4:
                 atmOperation.viewMiniStatement();
                 break;
             case 5:
                 System.out.println("Collect your ATM Card");
                 System.out.println("Thank you for using ATM Machine!!");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
                 break;
         }
     } while (choice != 5);

     scanner.close();
 }
}

