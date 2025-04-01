public class BankSystem {
    static class BankAccount {
        protected String accountNumber;
        protected double balance;
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        public void displayDetails() {
            System.out.println("Account Number: " + accountNumber + ", Balance: $" + balance);
        }
    }

    static class SavingsAccount extends BankAccount {
        private double interestRate;
        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance);
            this.interestRate = interestRate;
        }
        public void displayAccountType() {
            System.out.println("Savings Account - Interest Rate: " + interestRate + "%");
        }
    }

    static class CheckingAccount extends BankAccount {
        private double withdrawalLimit;
        public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
            super(accountNumber, balance);
            this.withdrawalLimit = withdrawalLimit;
        }
        public void displayAccountType() {
            System.out.println("Checking Account - Withdrawal Limit: $" + withdrawalLimit);
        }
    }

    static class FixedDepositAccount extends BankAccount {
        private int termMonths;
        public FixedDepositAccount(String accountNumber, double balance, int termMonths) {
            super(accountNumber, balance);
            this.termMonths = termMonths;
        }
        public void displayAccountType() {
            System.out.println("Fixed Deposit Account - Term: " + termMonths + " months");
        }
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("SA123", 5000, 4.5);
        CheckingAccount c = new CheckingAccount("CA456", 3000, 1000);
        FixedDepositAccount f = new FixedDepositAccount("FD789", 10000, 12);
        s.displayDetails();
        s.displayAccountType();
        c.displayDetails();
        c.displayAccountType();
        f.displayDetails();
        f.displayAccountType();
    }
}
