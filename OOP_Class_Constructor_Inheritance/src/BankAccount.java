public class BankAccount {
    private String account;
    private double balance;
    private String email;
    private String phoneNumber;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withdrawal(double withdrawalAmount){
        if (balance >= withdrawalAmount){
            balance -= withdrawalAmount;
            System.out.println("You withdrew " + withdrawalAmount + " Your Balance is " + balance);
        }
        else {
            System.out.println("Insufficient funds");
        }
    }
    public void deposit( double depositAmount){
        balance += depositAmount;
        System.out.println("You deposited " + depositAmount + " Your balance is " + balance);
    }
    @Override
    public String toString() {
        return "AccountNumber: " + account + "\nEmail: " + email +
                "\nYour account balance is " + balance;
    }
}
/*
Create a new class for a bank account
 Create fields for the account number, balance, customer name, email and phone number.

 Create getters and setters for each field
 Create two additional methods
 1. To allow the customer to deposit funds (this should increment the balance field).
 2. To allow the customer to withdraw funds. This should deduct from the balance field,
 but not allow the withdrawal to complete if there are insufficient funds.
 You will want to create various code in the Main class (the one created by IntelliJ) to
 confirm your code is working.
 Add some System.out.println's in the two methods above as well.%
 */