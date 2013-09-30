package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
  private int customerId;
  private String firstName;
  private String lastName;
  private String email;
  private List<Account> accounts = new ArrayList();
  private static int nextid = 1000;
  
  public static void save(Customer customer) {
      //Does nothing yet...
  }
  

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }
  

  public Customer(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    customerId = nextid++;
  }
  
  public void addAccount(Account account){
    accounts.add(account);
    account.setOwner(this);
  }
  
  public String toString(){
      return firstName + " " + lastName;
  }
  
  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
  
}
