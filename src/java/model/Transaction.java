package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {
  private static long nextId = 0;
  private long transactionId;
  private Date timestamp;
  private double amount;
  private double balance;
  private String info;
 //protected static List<Transaction> transactions;
  
  
  
  public Transaction(double amount, String info) {
    this.timestamp = new Date();
    this.amount = amount;
    this.info = info;
    transactionId = nextId++;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public long getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(long transactionId) {
    this.transactionId = transactionId;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

}
