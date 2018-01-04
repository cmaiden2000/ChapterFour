//*******************************************************
// Account.java
//
// A bank account class with methods to deposit to, withdraw from,
// change the name on, charge a fee to, and print a summary of the account.
//*******************************************************
public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number) {
      this.balance = initBal;
      this.name = owner; 
      this.acctNum = number;
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount) {
      if (amount <= initBal) {
        this.balance = initBal - amount;
        
      }
  }
  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount) {
      this.balance = initBal + amount;
  }
  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance() {
      System.out.println("Your balance is " + balance);
  }
  //----------------------------------------------
  // Returns a string containing the name, account number, and balance.
  //----------------------------------------------
  public String toString() {
      
  }
  //----------------------------------------------
  // Deducts $10 service fee
  //----------------------------------------------
  public void chargeFee() {
   
  }
  //----------------------------------------------
  // Changes the name on the account
  //----------------------------------------------
  public void changeName(String newName) {
  
   }
  
}
// ****************************************************************
//   ManageAccounts.java
//
//   Use Account class to create and manage Sally and Joe's
//   bank accounts      
// ****************************************************************
public class ManageAccounts
{
    public static void main(String[] args)
    {
        Account acct1, acct2;
        //create account1 for Sally with $1000
        acct1 = new Account(1000, "Sally", 1111);
        //create account2 for Joe with $500
        //deposit $100 to Joe's account
        //print Joe's new balance (use getBalance())
        //withdraw $50 from Sally's account
        //print Sally's new balance (use getBalance())
        //charge fees to both accounts
        //change the name on Joe's account to Joseph
        //print summary for both accounts
    }
}
