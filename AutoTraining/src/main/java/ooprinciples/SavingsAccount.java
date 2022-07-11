package ooprinciples;

public class SavingsAccount implements Account {
    private double interest_rate;

    public SavingsAccount(double bal,double i){
        super();
        this.interest_rate = i;
    }


    @Override
    public void withdraw(double amount) {

    }

    @Override
    public void deposit(double amount) {

    }

    /*public void withdraw(double amount){
        if (getBalance()-amount >0){
            setBalance(this.getBalance()-amount);
        }
        else{
            System.out.println("ERROR! You cannot overdraw on a Savings Account.");
        }

    }*/
}
