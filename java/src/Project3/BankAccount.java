package Project3;

public abstract class BankAccount {

    static int countAccounts = 0;

    protected String accountID = "0000-0000-0000-0000";
    protected double interestRate = 0.0;
    protected int balance = 0;

    public BankAccount(){
        countAccounts++;
    }

    public BankAccount( String accountID, double interestRate, int balance){
        this.accountID = accountID;
        this.interestRate = interestRate;
        this.balance = balance;
        countAccounts++;
    }


    public boolean credit(int amount){
        balance += amount;
        return true;
    };

    public abstract boolean debit(int amount);

    public int getBalance(){
        return this.balance;
    };

    public String getAccountID(){
        return this.accountID;
    };

    public void setAccountID(String accountID){
        this.accountID = accountID;
    };

    public double getInterestRate(){
        return this.interestRate;
    };

    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    };

    public abstract void applyInterest();
    public abstract String accountInfo();

}
