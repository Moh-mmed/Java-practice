package AutoboxingUnboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    private ArrayList<Transaction> transactions;

    public Branch(String name){
       this.name = name;
       this.customers = new ArrayList<>();
       this.transactions = new ArrayList<>();
    }

    public String getName(){
       return name;
    }
    public Boolean addNewCustomer(String customerName, double balance){
       if(!customerExist(customerName)){
           Customer newCustomer = new Customer(customerName, balance);
           customers.add(newCustomer);
           System.out.println("Customer was added successfully");
           return true;
       }
       else System.out.println("Customer's Name is already exist");
        return false;
    }
    public ArrayList<Customer> getCustomers(){
       return customers;
    }
    public Boolean customerExist(String customerName){
       for(Customer customer: customers){
           if(customer.getName().equals(customerName)) return true;
       }
       return false;
    }
    public Customer findCustomer(String customerName){
        for (Customer customer: getCustomers()){
            if(customer.getName().equals(customerName)){
                return customer;
            }
        }
        return null;
    }
    public Boolean makeTransaction( String senderName, String receiverName,String senderBranch, String receiverBranch, Double amount){
        Customer sender = findCustomer(senderName);
        if(sender.getBalance()<amount){
            System.out.println(sender.getName() + "'s balance is insufficient for this transaction");
            return false;
        }
        sender.deductTransaction(amount);
        transactions.add(new Transaction(senderName, receiverName,senderBranch,receiverBranch, amount));
        System.out.println("The transaction has been made successfully");
        return true;
    }
    public void receiveTransaction(String senderName, String receiverName,String senderBranch,String receiverBranch, Double amount){
        Customer receiver = findCustomer(receiverName);
        receiver.addTransaction(amount);
        transactions.add(new Transaction(senderName, receiverName,senderBranch,receiverBranch, amount));
    }
    public ArrayList<Transaction> getTransactions(){
        return transactions;
    }
}
