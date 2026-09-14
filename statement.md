# Problem Statement & Scope: CLI Bank Management System

## 1. Problem Statement
Traditional financial tracking tools often involve heavy graphical interfaces or remote database configurations that complicate automated verification, testing, and minimal-overhead execution. This project addresses the need for an efficient, resilient, command-line banking engine that demonstrates core Object-Oriented Programming (OOP), explicit business-rule validation, asynchronous thread-safe auditing, and modular data handling within a standard Java runtime.

## 2. Scope of the Project
* **Account Management:** Creation and lifecycle tracking for Savings and Current accounts with polymorphic withdrawal rules.
* **Transaction Processing:** Real-time deposit and withdrawal operations enforcing minimum balances and overdraft thresholds.
* **Audit Logging:** Non-blocking asynchronous file logging using dedicated worker threads.
* **Domain Alignment:** Built directly on the CSE2006 (Programming in Java) syllabus covering OOP, exception handling, multithreading, collections, and I/O streams.

## 3. Target Users
* Bank account holders seeking quick command-line transactional simulations.
* System administrators requiring lightweight local banking utilities with automated file audit trails.
* Academic evaluators assessing core Java paradigms in headless or terminal environments.

## 4. High-Level Features
* Dynamic dispatch on multi-tier accounts (`SavingsAccount` vs. `CurrentAccount`).
* Custom business exception handling (`InsufficientFundsException`).
* Concurrency control through synchronized file writer threads (`AuditLoggerThread`).
* Persistent ledger outputs (`audit_log.txt`) using character-oriented file streams.
