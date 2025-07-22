public class BankAccount {

    private String accountNumber;
    private double balance;


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount();


        account.setAccountNumber("123456789");
        account.setBalance(2500.75);

        
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
