package com.bank;

import com.bank.model.*;
import com.bank.exception.InsufficientFundsException;
import com.bank.service.AuditLoggerThread;
import java.util.*;

public class Main {
    private static final Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        accounts.put("ACC101", new SavingsAccount("ACC101", "Alice", 5000.0));
        accounts.put("ACC102", new CurrentAccount("ACC102", "Bob", 3000.0));

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        System.out.println("=== CORE JAVA BANKING SYSTEM ===");

        while (run) {
            System.out.println("\n1. View Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.print("Select: ");

            if (!sc.hasNextInt()) break;
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Account a = accounts.get("ACC101");
                    System.out.println("Holder: " + a.getHolderName() + " | Balance: Rs. " + a.getBalance());
                    break;
                case 2:
                    System.out.print("Amount: ");
                    double dep = sc.nextDouble();
                    accounts.get("ACC101").deposit(dep);
                    new AuditLoggerThread("Deposit: Rs. " + dep).start();
                    System.out.println("Success! New Balance: Rs. " + accounts.get("ACC101").getBalance());
                    break;
                case 3:
                    System.out.print("Amount: ");
                    double w = sc.nextDouble();
                    try {
                        accounts.get("ACC101").withdraw(w);
                        new AuditLoggerThread("Withdraw: Rs. " + w).start();
                        System.out.println("Success! New Balance: Rs. " + accounts.get("ACC101").getBalance());
                    } catch (InsufficientFundsException e) {
                        System.out.println("Error: " + e.getMessage());
                    } catch (Exception e) {
                        System.out.println("General error: " + e.getMessage());
                    }
                    break;
                case 4:
                    run = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        }
        sc.close();
    }
}