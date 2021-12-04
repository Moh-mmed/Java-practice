package Inheritance;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // New account
        Account user1 = new Account("11056987002", 500,"Ahmed","Ahmed@admin.com","+90856785236");
        Scanner input = new Scanner(System.in);

        // New devise account
        Devise_account user1Devise = new Devise_account("00000898", 20000,"Ahmed", "Ahmed@admin.com","Euro");

        int choice;
        do{
            System.out.println("1- Fund deposit.\n2- Fund withdraw\n3- Balance check\n4- Get your all credentials\n5- Get your devise account's all credentials\n0- Exit\nEnter your operation: ");
            try{
                choice = input.nextInt();
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter deposit amount: ");
                        double deposit_amount = input.nextDouble();
                        user1.deposit_funds(deposit_amount);
                    }
                    case 2 -> {
                        System.out.println("Enter withdrawal amount: ");
                        double withdrawal_amount = input.nextDouble();
                        user1.withdraw_funds(withdrawal_amount);
                    }
                    case 3 -> user1.getAccount_balance();
                    case 4 -> {
                        user1.getCustomer_name();
                        user1.getAccount_num();
                        user1.getCustomer_email();
                        user1.getCustomer_number();
                        user1.getAccount_balance();
                    }
                    case 5 -> {
                        System.out.println("Devise account credentials: ");
                        user1Devise.getCustomer_name();
                        user1Devise.getAccount_num();
                        user1Devise.getCustomer_email();
                        user1Devise.getCustomer_number();
                        user1Devise.getAccount_balance();
                    }
                    case 0 -> System.out.println("Thank you for your visit.");
                    default -> System.out.println("Please, Enter a valid operation");
                }
            }
            catch (Exception e){
                System.out.println("Please enter a number");
                choice = 0;
            }

        }while(choice != 0);
    }

}
