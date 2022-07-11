package session2;

public class UseAccount {

    public static void main(String[] args){
        Account account1 = new Account(250315548, Account.AccountType.CHEQUE,0);
        account1.setBalance(6000);

        System.out.println(account1);

        //account.deposit(50);
        //account.withdraw(25);

        //System.out.println(account.printAccountInfo());

      /*  Account[] accounts = new Account[4];
        accounts[0] = new Account(1, Account.AccountType.SAVINGS,6000);
        accounts[2] = new Account(2, Account.AccountType.CHEQUE,0);
        accounts[1] = new Account(3, Account.AccountType.FOREX,15000);
        accounts[3] = new Account(3, Account.AccountType.SAVINGS,200);
        //accounts[3] = new Account(4,"Forex Trading",300);

        *//*for (int count=0;count<accounts.length;count++){
            System.out.println(accounts[count].printAccountInfo());
            accounts[count].deposit(2000);
            System.out.println("\t\tAfter Depositing R"+2000+": "+accounts[count].printAccountInfo());
        }*//*

        for(Account acc: accounts){
            System.out.println(acc.printAccountInfo());
            acc.withdraw(2500);

        }*/
    }
}
