public class Bank{
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayinfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder name: " + accountHolderName);
        System.out.println("Initial Balance: " + balance);
    }
}

class BankDriver {
    public static void main(String[] args) {
        Bank account = new Bank("123456", "Sita", 5000);
        account.displayinfo();
        account.deposit(1000);
        account.withdraw(2000);
        System.out.println("Bank Balance: " + account.getBalance());
    }
}