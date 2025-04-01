public class Main2 {
    static class BankAccount {
        public int accountNumber;
        protected String accountHolder;
        private double balance;
        public BankAccount(int accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }
        public double getBalance() {
            return balance;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }
        public void displayAccountInfo() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
        }
    }
    static class SavingsAccount extends BankAccount {
        private double interestRate;

        public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
            super(accountNumber, accountHolder, balance);
            this.interestRate = interestRate;
        }
        public void displaySavingsInfo() {
            System.out.println("Savings Account Info:");
            System.out.println("Account Number (public): " + accountNumber);
            System.out.println("Account Holder (protected): " + accountHolder);
            System.out.println("Interest Rate: " + interestRate + "%");
        }
    }
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(1001, "Alice", 5000.0);
        ba.displayAccountInfo();
        ba.setBalance(6000.0);
        System.out.println("Updated Balance: " + ba.getBalance());
        System.out.println();
        SavingsAccount sa = new SavingsAccount(2001, "Bob", 8000.0, 3.5);
        sa.displayAccountInfo();
        sa.displaySavingsInfo();
    }
}
