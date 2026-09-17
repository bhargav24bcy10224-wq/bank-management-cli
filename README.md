# CLI Bank Management System

A Java command-line interface (CLI) banking platform demonstrating core Object-Oriented Programming (OOP), multithreading, custom exception handling, and character I/O streams.

## Features
* **Interactive Terminal Menu:** Seamless navigation for deposits, withdrawals, and balance inquiries.
* **Polymorphic Account Handling:** Distinct business rules dynamically applied for `SavingsAccount` and `CurrentAccount`.
* **Custom Exception Handling:** Graceful error recovery (`InsufficientFundsException`) for invalid inputs or boundary breaches without crashing the program.
* **Asynchronous Audit Logging:** A background worker thread automatically records all successful and failed transactions to `audit_log.txt` using timestamped character streams.

## Prerequisites
* Java Development Kit (JDK 11 or higher)

## Screenshots

**Successful Deposit Transaction:**
<img width="1400" height="162" alt="Screenshot 2026-09-14 165336" src="https://github.com/user-attachments/assets/19e10f05-47c7-435a-922c-37f2e7eca44e" />

**Custom Exception Handling (Minimum Balance):**
<img width="1412" height="171" alt="Screenshot 2026-09-14 165502" src="https://github.com/user-attachments/assets/b78ce244-4a7b-4050-a40e-4f4225bdabfb" />


**Asynchronous Audit Ledger (audit_log.txt):**
<img width="1416" height="381" alt="Screenshot 2026-09-14 165613" src="https://github.com/user-attachments/assets/023aae9d-9a99-4fe9-90ac-30a4f7c8ab20" />


**1. Compile the Source Code**
Open your terminal at the root of the project and run:
```bash
javac -d bin src/com/bank/model/*.java src/com/bank/exception/*.java src/com/bank/service/*.java src/com/bank/Main.java
```
**2. Run the Application**
Execute the compiled program from the root directory:
```bash
java -cp bin com.bank.Main
```
## Instructions for Testing
1. **Launch the Application:** Run the application using the execution command above.
2. **Test Valid Transactions:** Select option `2` to deposit funds, then option `1` to verify the accurately updated balance in memory.
3. **Test Boundary Conditions:** Select option `3` and attempt to withdraw an amount greater than the current balance or below the minimum limit. Verify that the system successfully catches the custom exception and returns to the main menu instead of terminating.
4. **Verify Ledger Persistence:** Exit the application (Option `4`). Open the auto-generated `audit_log.txt` file in your root directory to confirm all successful and failed transactions were permanently recorded with standard ISO timestamps.
