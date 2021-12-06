package AutoboxingUnboxing;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double balance;
    private ArrayList<Double> transactions;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Double transaction) {
        setBalance(transaction);
        transactions.add(transaction);
    }
    public void deductTransaction(Double transaction){
        setBalance(-transaction);
        transactions.add(-transaction);
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
