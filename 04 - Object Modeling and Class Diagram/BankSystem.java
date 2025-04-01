import java.util.ArrayList;
import java.util.List;
public class BankSystem {
    static class Account {
        private String accountNumber;
        private double balance;
        public Account(String accountNumber) {
            this.accountNumber = accountNumber;
            this.balance = 0.0;
        }
        public String getAccountNumber() {
            return accountNumber;
        }
        public double getBalance() {
            return balance;
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
    }
    static class Customer {
        private String name;
        private List<Account> accounts;
        public Customer(String name) {
            this.name = name;
            this.accounts = new ArrayList<>();
        }
        public void addAccount(Account account) {
            accounts.add(account);
        }
        public void viewBalance() {
            System.out.println("Balances for " + name + ":");
            for (Account account : accounts) {
                System.out.println("- Account " + account.getAccountNumber() + ": $" + account.getBalance());
            }
        }
        public String getName() {
            return name;
        }
    }
    static class Bank {
        private String bankName;
        private List<Customer> customers;
        public Bank(String bankName) {
            this.bankName = bankName;
            this.customers = new ArrayList<>();
        }

        public void openAccount(Customer customer, String accountNumber) {
            Account newAccount = new Account(accountNumber);
            customer.addAccount(newAccount);
            if (!customers.contains(customer)) {
                customers.add(customer); // associate customer with bank
            }
            System.out.println("Account " + accountNumber + " opened for " + customer.getName() + " in " + bankName);
        }

        public String getBankName() {
            return bankName;
        }
    }
    public static void main(String[] args) {
        Bank bank = new Bank("Global Trust Bank");
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        bank.openAccount(customer1, "ACC1001");
        bank.openAccount(customer1, "ACC1002");
        bank.openAccount(customer2, "ACC2001");
        customer1.accounts.get(0).deposit(500);
        customer1.accounts.get(1).deposit(1000);
        customer2.accounts.get(0).deposit(750);
        customer2.accounts.get(0).withdraw(250);
        System.out.println();
        customer1.viewBalance();
        System.out.println();
        customer2.viewBalance();
    }
}
