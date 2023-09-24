package Aarti;

import java.util.Scanner;

class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     balance = initialBalance;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     balance += amount;
 }

 public boolean withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         return true;
     } else {
         return false;
     }
 }
}

class ATM {
 private BankAccount account;

 public ATM(BankAccount account) {
     this.account = account;
 }

 public void displayMenu() {
     System.out.println("Welcome to the ATM!");
     System.out.println("1. Check Balance");
     System.out.println("2. Deposit");
     System.out.println("3. Withdraw");
     System.out.println("4. Exit");
 }

 public void checkBalance() {
     double balance = account.getBalance();
     System.out.println("Your balance is: $" + balance);
 }

 public void deposit(double amount) {
     account.deposit(amount);
     System.out.println("Deposited $" + amount);
 }

 public void withdraw(double amount) {
     if (account.withdraw(amount)) {
         System.out.println("Withdrawn $" + amount);
     } else {
         System.out.println("Insufficient balance.");
     }
 }
}

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     BankAccount userAccount = new BankAccount(1000);

     ATM atm = new ATM(userAccount);

     int choice;
     do {
         atm.displayMenu();
         System.out.print("Enter your choice: ");
         choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 atm.checkBalance();
                 break;
             case 2:
                 System.out.print("Enter the deposit amount: $");
                 double depositAmount = scanner.nextDouble();
                 atm.deposit(depositAmount);
                 break;
             case 3:
                 System.out.print("Enter the withdrawal amount: $");
                 double withdrawalAmount = scanner.nextDouble();
                 atm.withdraw(withdrawalAmount);
                 break;
             case 4:
                 System.out.println("Thank you for using the ATM!");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     } while (choice != 4);

     scanner.close();
 }
}
