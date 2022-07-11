package ooprinciples;

public class CheckingAccount {
    private String acc_num;
    private double balance;

    public CheckingAccount(){
        this.acc_num = "0000001";
        this.balance = 0.0;
    }

    public CheckingAccount(double amount){
        this.acc_num = "0123456789";
        this.balance = amount;
    }

    public CheckingAccount(String acc, double amount){
        this.acc_num = acc;
        this.balance = amount;
    }

    public void deposit(double amount){
        this.balance += amount;
    }



    public void withdraw(double amount){
        this.balance-=amount;
    }

    public String account_info(){
        String message = String.format("Account number #%s has Balance R%.2f", this.acc_num,this.balance);
        return message;

    }
}