import java.util.Scanner;

 class ATM   // specifying class Atm
 {

    private BankAccount userAcct;
    private Scanner scanner;

    public ATM(BankAccount userAcct) {
        this.userAcct = userAcct;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();                 // calling checkBalance method
                    break;
                case 2:
                    deposit();                 // calling deposit method
                    break;
                case 3:
                    withdraw();               // calling withdraw method
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void checkBalance()       // specifying checkBalance method
    {
        double bal = userAcct.getBalance();
        System.out.println("");

        System.out.println("Account balance: Rs " + bal);
        System.out.println("");

    }

    private void deposit()    // specifying deposit method
    {
        System.out.print("Enter the amount to deposit: Rs ");
        double amnt = scanner.nextDouble();
        System.out.println("");

        userAcct.deposit(amnt);
        System.out.println("Rs" + amnt + " deposited successfully.");
        System.out.println("");

    }

    private void withdraw()   // specifying withdraw method
    {

        System.out.print("Enter the amount to withdraw: Rs ");

        double amount = scanner.nextDouble();
        if (userAcct.withdraw(amount)) {

            System.out.println("");
            System.out.println("Rs" + amount + " withdrawn successfully.");
            System.out.println("");

        } 
        else {
            System.out.println("Insufficient balance. Withdrawal failed.");
            System.out.println("");

        }
    }

    private void exit() {
        System.out.println("Thank you for using the ATM.");
        System.exit(0);
    }
}
 class BankAccount   // specifying class BankAccount
 {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
public class Main        // calling main method
{
    public static void main(String[] args) {

        BankAccount userAcct = new BankAccount(1000.0);   // creating object userAcct of BankAccount class


        ATM atm = new ATM(userAcct);    // creating atm object of Atm class


        atm.run();
    }
}
