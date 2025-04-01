interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // Fixed interest rate for current accounts
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

class PersonalLoanAccount implements Loanable {
    private double loanAmount;
    private double eligibleAmount;

    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return loanAmount <= eligibleAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setEligibleAmount(double eligibleAmount) {
        this.eligibleAmount = eligibleAmount;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("S123", "John Doe", 5000, 4.5);
        BankAccount currentAccount = new CurrentAccount("C456", "Jane Smith", 3000, 1000);

        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);
        System.out.println("Savings Account Interest: " + savingsAccount.calculateInterest());

        currentAccount.deposit(2000);
        currentAccount.withdraw(1500);
        System.out.println("Current Account Interest: " + currentAccount.calculateInterest());

        Loanable personalLoan = new PersonalLoanAccount();
        ((PersonalLoanAccount) personalLoan).setLoanAmount(5000);
        ((PersonalLoanAccount) personalLoan).setEligibleAmount(10000);
        personalLoan.applyForLoan();
        System.out.println("Loan Eligibility: " + personalLoan.calculateLoanEligibility());
    }
}
