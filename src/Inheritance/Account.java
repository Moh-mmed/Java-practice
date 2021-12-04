package Inheritance;

public class Account {
    private String account_num;
    private double account_balance;
    private String customer_name;
    private String customer_email;
    private String customer_number;




//    public Inheritance.Account(){
//        this("xxxxxx",0000.0, "Unknown", "xxxx@xxx.com", "+90x xxx xxxx");
//    }
    public Account(String account_num, double account_balance, String customer_name, String customer_email, String customer_number) {
        // It's not recommended to use setters or any other methods in the constructor
        this.account_num = account_num;
        this.account_balance = account_balance;
        this.customer_name = customer_name;
        this.customer_email = customer_email;
        this.customer_number = customer_number;
    }


    // Deposit funds
    public void deposit_funds(double amount){
        this.account_balance += amount;
        System.out.println(this.customer_name + ", Your account balance now is: $"+this.account_balance);
    }

    // Withdraw funds
    public void withdraw_funds(double amount){
        if(this.account_balance-amount >=0){
            this.account_balance -= amount;
            System.out.println("Your account balance now is: $"+this.account_balance);
        }else{
            System.out.println("Sorry, you can't continue the operation. Your account balance is insufficient, it contains only: $"+this.account_balance);
        }
    }
    // Getters & Setters
    public void getAccount_num() {
        System.out.println("Inheritance.Account Email: "+ this.account_num);
    }

    public void setAccount_num(String account_num) {
        this.account_num = account_num;
    }

    public void getAccount_balance() {
        System.out.println("Your balance is: $"+ this.account_balance);
    }

    public void setAccount_balance(double account_balance) {
        this.account_balance = account_balance;
    }

    public void getCustomer_name() {
        System.out.println("Email: "+ this.customer_name);
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void getCustomer_email() {
        System.out.println("Email: "+ this.customer_email);
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public void getCustomer_number() {
        System.out.println("Phone Number: "+ this.customer_number);
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }
}
