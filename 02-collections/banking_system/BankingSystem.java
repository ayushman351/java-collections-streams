package banking_system;

import java.util.*;

public class BankingSystem {
    private Map<Integer, Double> accounts;
    private Queue<Integer> withdrawalQueue;

    public BankingSystem() {
        accounts = new HashMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    // Add a new account
    public void addAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    // Deposit money
    public void deposit(int accountNumber, double amount) {
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0.0) + amount);
    }

    // Request a withdrawal
    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    // Process withdrawals
    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for account: " + accountNumber);
        }
    }

    // Display accounts sorted by balance
    public void displaySortedAccounts() {
        TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sortedAccounts.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Accounts sorted by balance: " + sortedAccounts);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(1001, 5000.0);
        bank.addAccount(1002, 3000.0);
        bank.addAccount(1003, 7000.0);

        bank.deposit(1002, 2000.0);
        bank.requestWithdrawal(1001);
        bank.requestWithdrawal(1003);

        bank.processWithdrawals();
        bank.displaySortedAccounts();
    }
}
