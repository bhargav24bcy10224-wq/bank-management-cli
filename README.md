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


## Build and Execution Instructions

**1. Compile the Source Code**
Open your terminal at the root of the project and run:
```bash
javac -d bin src/com/bank/model/*.java src/com/bank/exception/*.java src/com/bank/service/*.java src/com/bank/Main.java
