package session2;

public class Account {
    private int acc_number;
    private AccountType type;
    private int balance;

    public Account(){
        this.acc_number = 1234567890;
        this.type = AccountType.SAVINGS; //Default Account type
        this.balance = 0;
    }

    public Account(int number, AccountType acc_type, int amount){
        this.acc_number = number;
        this.type = acc_type;
        this.balance = amount;
    }

    public int getAcc_number(){
        return this.acc_number;
    }

    public void setAcc_number(int acc_number){
        this.acc_number = acc_number;
    }

    public AccountType getType(){
        return this.type;
    }

    public void setType(AccountType acc_type){
        this.type = acc_type;
    }

    public int getBalance(){
        return this.balance;
    }

    public void setBalance(int amount){
        this.balance = amount;
    }

    public String getAccountInfo(){
        String details = String.format("Account Number %d\nAccount Type: %s\nAccount Balance: R%d",this.acc_number,this.type, this.balance);
        return details;
    }

    public void withdraw(int amount){
        /*if (this.getType() == AccountType.CHEQUE){
            this.balance -= amount;

        }
        else if (this.getType() == AccountType.SAVINGS && this.getBalance()-amount >=0) {
            this.balance -= amount;
        }
        else {

        }
        else{
            System.out.println("**********Incorrect Account Type:"+this.getType()+" to withdraw.");
        }*/

        switch (this.getType()){
            case CHEQUE:
                this.balance -= amount;
                System.out.println("Successfully withdrawn :R"+amount+" current balance R"+this.getBalance());
                break;
            case SAVINGS:
                if (this.getBalance()-amount >= 0){
                    this.balance=-amount;
                    System.out.println("Successfully withdrawn :R"+amount+" current balance R"+this.getBalance());
                }
                else{
                    System.out.println("**********Insufficient Balance:R"+this.getBalance()+" to withdraw R"+amount);
                }
                break;
            default:
                System.out.println("**********Incorrect Account Type:"+this.getType()+" to withdraw.");

        }

    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public String printAccountInfo(){
        return String.format("\nThe current balance of %s account #%d is R%d", this.type,this.acc_number,this.balance);
    }

    public enum AccountType{
        SAVINGS,
        CHEQUE,
        FOREX
    }

    public void getMonthName(int n){
        switch (n){
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
            default -> System.out.println("Incorrect value for corresponding month");

        }
    }

    public static class CheckingAccount {
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

        protected String getAcc_num() {
            return acc_num;
        }

        protected void setAcc_num(String acc_num) {
            this.acc_num = acc_num;
        }

        protected double getBalance() {
            return balance;
        }

        protected void setBalance(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount){
                this.balance-=amount;
        }

        public String account_info(){
            String message = String.format("Account number #%s has Balance R%.2f", this.acc_num,this.balance);
            return message;

        }
    }
}
