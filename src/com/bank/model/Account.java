package com.bank.model; 
import java.io.Serializable; 
public abstract class Account implements Serializable { 
  protected String accountNumber; 
  protected String holderName; 
  protected double balance; 
  
  public Account(String acc, String name, double bal) { 
    this.accountNumber = acc; 
    this.holderName = name; 
    this.balance = bal; 
  } 
  
  public abstract void withdraw(double amt) throws Exception; 
  
  public void deposit(double amt) { 
    if(amt > 0) balance += amt; 
  } 
  
  public String getAccountNumber() { return accountNumber; } 
  
  public String getHolderName() { return holderName; } 
  
  public double getBalance() { return balance; } }
