package AutoboxingUnboxing;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static  Bank BDL = new Bank();

    public static void main(String[] args){
        listInstructions();
    BDL.addNewBranch("Rouiba");
    BDL.addNewBranch("Bab Ezzaouar");
    BDL.addNewBranch("Ziralda");
    int command = 1;
    while(command !=0){
    command = scanner.nextInt();
        switch (command){
            case 1-> listInstructions();
            case 2-> listBranches();
            case 3->listCustomers();
            case 4->registerNewCustomer();
            case 5->makeTransaction();
            case 6->searchForCustomer();
            case 7->listAllTransaction();
        }
    }
        System.out.println("Happy for your visit.");

    }
    private static void listInstructions(){
        System.out.println("Instructions:");
        System.out.println("press");
        System.out.println("0- Sign out.");
        System.out.println("1- List the instructions.");
        System.out.println("2- List branches.");
        System.out.println("3- List customers.");
        System.out.println("4- Register a new customer.");
        System.out.println("5- Make a transaction.");
        System.out.println("6- Search for customer.");
        System.out.println("7- List all customer's transactions.");
    }
    private static void listBranches(){
        System.out.println("BDL has "+BDL.branches.size()+" Branches:");
        for(Branch branch: BDL.branches){
            System.out.println("- "+branch.getName()+".");
        }
        System.out.println("\n"+"*".repeat(50)+"\n");
        listInstructions();
    }
    private static void listCustomers(){
        System.out.println("Branch Name: ");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        Branch branch = BDL.findBranch(branchName);
        if(branch != null){
            ArrayList<Customer> customers = branch.getCustomers();
            if(customers.size()>0){
                for (Customer customer: customers){
                    System.out.println("- "+customer.getName());
                }
            }else{
                System.out.println("There is no customer in this branch.");
            }

        }
        else{
            System.out.println("The entered branch dose not exist for BDL bank.");
        }
        System.out.println("\n"+"*".repeat(50)+"\n");
        listInstructions();
    }
    private static void registerNewCustomer(){
        System.out.println("Select a branch name from: ");
        for(Branch branch: BDL.branches){
            System.out.println("- "+branch.getName()+".");
        }
        scanner.nextLine();
        String branchName = scanner.nextLine();
        Branch branch = BDL.findBranch(branchName);
        if(branch == null) {
            System.out.println("The entered branch dose not exist for BDL bank.");
            System.out.println("\n"+"*".repeat(50)+"\n");
            listInstructions();
            return;
        }
        System.out.println("Enter customer name: ");
        String customerName = scanner.nextLine();
        if(branch.customerExist(customerName)){
            System.out.println("Customer's Name is already exist");
            System.out.println("\n"+"*".repeat(50)+"\n");
            listInstructions();
            return;
        }
        System.out.println("Enter balance: ");
        double balance = scanner.nextDouble();
        branch.addNewCustomer(customerName,balance);
        System.out.println("\n"+"*".repeat(50)+"\n");
        listInstructions();
    }
    private static void makeTransaction(){
        System.out.println("Enter sender's name: ");
        scanner.nextLine();
        String senderName = scanner.nextLine();
        System.out.println("Enter receiver's name: ");
        String receiverName = scanner.nextLine();
        System.out.println("Enter the amount: ");
        double amount = scanner.nextDouble();
        System.out.println(senderName);
        System.out.println(receiverName);
        System.out.println(amount);
        Branch senderBranch = BDL.findCustomerBranch(senderName);
        Branch receiverBranch = BDL.findCustomerBranch(receiverName);
        if(senderBranch == null){
            System.out.println(senderName+" does not exist");
        }
        else if(receiverBranch== null){
            System.out.println(receiverName+" does not exist");
        }
        else {
            if(senderBranch.makeTransaction(senderName, receiverName,senderBranch.getName(),receiverBranch.getName(), amount)){
                receiverBranch.receiveTransaction(senderName, receiverName,senderBranch.getName(),receiverBranch.getName(), amount);
            }
        }
        System.out.println("\n"+"*".repeat(50)+"\n");
        listInstructions();
    }
    private static void searchForCustomer(){
        System.out.println("Enter customer name: ");
        scanner.nextLine();
        String customerName = scanner.nextLine();
        Branch branch = BDL.findCustomerBranch(customerName);
        if(branch==null){
            System.out.println("Customer dose not exist");
            System.out.println("\n"+"*".repeat(50)+"\n");
            listInstructions();
            return;
        }
        if(branch.customerExist(customerName)){
            Customer customer = branch.findCustomer(customerName);
            System.out.println("Customer's name: "+ customer.getName()+
                               "\nCustomer's balance: "+ customer.getBalance()+
                                "\nCustomer's branch "+ branch.getName());
            if(customer.getTransactions().size()>0){
                System.out.println("Customer's transactions: ");
                for(Double transaction: customer.getTransactions()){
                    System.out.println("-> "+(transaction>=0?"+"+transaction:transaction));
                }
            }else{
                System.out.println("There is no transaction");
            }
        }
        System.out.println("\n"+"*".repeat(50)+"\n");
        listInstructions();
    }
    private static void listAllTransaction(){
        System.out.println("Branch Name: ");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        Branch branch = BDL.findBranch(branchName);
        if(branch != null){
            ArrayList<Transaction> transactions = branch.getTransactions();
            if(transactions.size()>0){
                int counter = 0;
                for (Transaction transaction: transactions){
                    System.out.println(++counter+") "+"from: "+transaction.getSender()+"("+transaction.getSenderBranch()+" branch)"+
                            " to: "+transaction.getReceiver()+"("+transaction.getReceiverBranch()+" branch)"+ ", Amount: "+transaction.getAmount());
                }
            }else{
                System.out.println("There is no transaction in this branch.");
            }

        }
        else{
            System.out.println("The entered branch dose not exist for BDL bank.");
        }
        System.out.println("\n"+"*".repeat(50)+"\n");
        listInstructions();
    }
}
