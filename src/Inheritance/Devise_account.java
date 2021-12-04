package Inheritance;

public class Devise_account extends Account {
    // Should have a default constructor
    String currency;
    public Devise_account(String account_num, double account_balance, String customer_name, String customer_email, String currency) {
        super(account_num, account_balance, customer_name, customer_email, "+90X XXX XXXX");
        this.currency = currency;
        this.getAccount_balance();
    }

    @Override
    public void getAccount_balance() {
        System.out.println("Your account balance in Euro");
        super.getAccount_balance();
    }
}
