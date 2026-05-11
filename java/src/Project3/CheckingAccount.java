package Project3;

public class CheckingAccount extends BankAccount{
    private int overdraftFee = 0;

    @Override
    public boolean debit(int amount) {
        balance -= amount;

        // If the account goes into overdraft (balance < 0), deduct the overdraft fee.
        if (balance < 0) {
            balance -= overdraftFee;
        }

        return true; // Return true to indicate the operation was successful.
    }

    @Override
    public void applyInterest() {
        if(balance <= 0) return;

        double interestAmount = balance * interestRate;
        balance += (int) interestAmount;

    }

    @Override
    public String accountInfo() {
        String info = "Type of Account : Checking\n";
        info += "Account ID      : " + getAccountID() + "\n";
        info += "Current Balance : $" + String.format("%.2f\n", (balance / 100.0));
        info += "Interest rate   : " + String.format("%.2f%%\n", (interestRate * 100));
        info += "Overdraft Fee   : $" + String.format("%.2f\n", (overdraftFee / 100.0));
        return info;
    }

    public void setFee(int fee){
        this.overdraftFee = fee;
    };
    public int getFee(){
        return this.overdraftFee;
    };
}
