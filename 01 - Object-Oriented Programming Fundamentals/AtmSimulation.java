import java.util.Scanner;
class BankAccount{
    private String accountHolder;
    private String accountNumber;
    private double balance;
    public BankAccount(String accountHolder, String accountNumber, double initialBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Depoist successfull. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful. New Balnace: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void displayBalance(){
        System.out.println("Current balance: " + balance);
    }
}
public class AtmSimulation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        String accNumber = scanner.nextLine();
        System.out.print("Enter Initial Balnace: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(name, accNumber, initialBalance);
        while(true){
            System.out.println("\nATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using our ATM.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. please try again.");
            }
        }
    }
}